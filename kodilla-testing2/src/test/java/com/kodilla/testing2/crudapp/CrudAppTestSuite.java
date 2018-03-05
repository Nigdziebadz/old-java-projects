package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    private final static String BASE_URL = "https://nigdziebadz.github.io";
    private Random generator;
    private WebDriver driver;

    @Before
    public void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCruddAppTestTask() throws InterruptedException {
        final String TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String ADD_A_TASK = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number: " + generator.nextInt(100000);
        String taskContent = taskName + " task content";

        WebElement name = driver.findElement(By.xpath(TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(ADD_A_TASK));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))

                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkIfTaskExistInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("lesialockhart");
        driverTrello.findElement(By.id("password")).sendKeys("lesiakodilla");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref ->
                aHref.findElements(By.xpath(".//span[2]/span[@title=\"Kodilla App\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan ->
                theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    private void deleteTaskFromCrudApp(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))

                .forEach(theForm -> {
                WebElement deleteButton = theForm.findElement(By.xpath(".//button[4]"));
                deleteButton.click();
        });

        Thread.sleep(5000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException  {
        String taskName = createCruddAppTestTask();
        sendTaskToTrello(taskName);
        assertTrue(checkIfTaskExistInTrello(taskName));
        deleteTaskFromCrudApp(taskName);
    }
}
