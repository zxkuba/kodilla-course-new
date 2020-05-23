package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationFacade {

    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    public OrganizationFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Company> findCompany (String partOfName){
        return companyDao.findCompanyByPartOfName(partOfName);
    }

    public List<Employee> findEmployee (String partOfLastName){
        return employeeDao.findEmployeeByPartOfName(partOfLastName);
    }


}
