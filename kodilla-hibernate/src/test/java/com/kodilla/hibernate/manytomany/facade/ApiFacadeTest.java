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




    @Test
    public void searchCompanyByName() throws Exception{
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);
        companyDao.save(softwareMachine);

        Assert.assertEquals("Software Machine", apiFacade.searchCompanyByName("war").get(0).getName());

        companyDao.deleteAll();
    }

    @Test
    public void searchEmployeeByName() throws Exception{
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);
        employeeDao.save(johnSmith);

        Assert.assertEquals("Smith", apiFacade.searchEmployeeByName("mit").get(0).getLastname());

        employeeDao.deleteAll();
    }
}