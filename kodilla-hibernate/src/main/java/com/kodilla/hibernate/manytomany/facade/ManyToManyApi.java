package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyApi {

    @Autowired
    private CompanyDao companyDao;

    public List<Company> getCompaniesByName(String nameFragment) {

        List<Company> result = companyDao.searchByName(nameFragment);
        return result;
    }
}
