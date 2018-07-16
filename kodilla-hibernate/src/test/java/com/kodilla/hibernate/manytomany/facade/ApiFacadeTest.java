package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiFacadeTest {
    @Autowired
    ApiFacade apiFacade;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    Company softwareMachine = new Company("Software Machine");
    Employee johnSmith = new Employee("John", "Smith");

    @Test
    public void searchCompanyByName() throws Exception{
        companyDao.deleteAll();
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);
        companyDao.save(softwareMachine);
        int companyId = softwareMachine.getId();

        Assert.assertEquals("Software Machine", apiFacade.searchCompanyByName("war"));

        companyDao.delete(companyId);
    }

    @Test
    public void searchEmployeeByName() throws Exception{
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);
        employeeDao.save(johnSmith);
        int employeeId = johnSmith.getId();

        Assert.assertEquals("John Smith", apiFacade.searchEmployeeByName("mit"));

        employeeDao.delete(employeeId);
    }
}