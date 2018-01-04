package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Gumka do golenia lustra");
        Product product2 = new Product("Krawat ze skomplikowaną instrukcją obsługi");
        Product product3 = new Product("Wywiabiacz do szefów");

        Item item1 = new Item(10, new BigDecimal(100),
                new BigDecimal(1000));
        Item item2 = new Item(2, new BigDecimal(20),
                new BigDecimal(200));
        Item item3 = new Item(100, new BigDecimal(1000),
                new BigDecimal(10000));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        Invoice invoice = new Invoice("2018/1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        productDao.save(product3);
        int product3Id = product3.getId();
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);


        // CleanUp
        try {
            productDao.delete(product1Id);
            productDao.delete(product2Id);
            productDao.delete(product3Id);
            invoiceDao.delete(invoiceId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
