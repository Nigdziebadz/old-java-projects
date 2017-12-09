package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("TaskList no 1", "Testing TaskList creation" );
        taskListDao.save(taskList);
        String checkList = taskList.getListName();

        //When
        List<TaskList> findListName = taskListDao.findByListName(checkList);

        //Then
        Assert.assertEquals(1, findListName.size());

        //Clean
        int checkedId = findListName.get(0).getId();
        taskListDao.delete(checkedId);

    }


}
