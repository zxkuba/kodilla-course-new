package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrganizationFacadeTest {

    @Autowired
    OrganizationFacade organizationFacade;

    @Test
    public void facadeTest(){
        //Given
        Employee janNowak = new Employee("Jan", "Nowak");
        Company budgetIt = new Company("BudgetIt");

        budgetIt.getEmployees().add(janNowak);
        janNowak.getCompanies().add(budgetIt);



        //When
        List<Employee> findEmployee = organizationFacade.findEmployee("now");
        List<Company> findCompany = organizationFacade.findCompany("bu");

        //Then
        assertEquals(1, findEmployee.size());
        assertEquals(1, findCompany.size());
    }



}