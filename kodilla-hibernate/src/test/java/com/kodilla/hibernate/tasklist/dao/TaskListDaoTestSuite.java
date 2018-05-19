package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
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
    TaskListDao taskListDao;

    @Test
    public void testFindByListName() {

        TaskList taskList = new TaskList("Test list", "This list was created for test");

        taskListDao.save(taskList);

        List<TaskList> testTaskList = taskListDao.findByListName("Test list");

        Assert.assertEquals(1, testTaskList.size());

        int id = testTaskList.get(0).getId();
        taskListDao.deleteAll();

    }
}
