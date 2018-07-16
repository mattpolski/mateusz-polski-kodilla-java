package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiFacade.class);

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<Company> searchCompanyByName(final String partOfName) throws Exception {
        List<Company> searchResult = companyDao.searchCompanyByName("%" + partOfName + "%");
        if (searchResult.size() == 0) {
            LOGGER.info(Exception.ERR_COMPANY_NOT_FOUND);
            throw new Exception(Exception.ERR_COMPANY_NOT_FOUND);
        } else {
            return searchResult;
        }
    }

    public List<Employee> searchEmployeeByName(final String partOfName) throws Exception {
        List<Employee> searchResult = employeeDao.searchEmployeeByName("%" + partOfName + "%");
        if (searchResult.size() == 0) {
            LOGGER.info(Exception.ERR_EMPLOYEE_NOT_FOUND);
            throw new Exception(Exception.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return searchResult;
        }
    }
}
