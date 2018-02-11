package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyApi {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> getCompaniesByName(String nameFragment) {
        List<Company> result = companyDao.searchByNameFragment(nameFragment);
        return result;
    }

    public List<Employee> getEmployeeByName(String lastNameFragment) {
        List<Employee> result = employeeDao.searchByLastNameFragment(lastNameFragment);
        return result;
    }
}
