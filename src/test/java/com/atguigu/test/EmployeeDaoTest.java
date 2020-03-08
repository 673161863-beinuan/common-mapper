package com.atguigu.test;

import com.atguigu.javabean.Employee;
import com.atguigu.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class EmployeeDaoTest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    private EmployeeService employeeService = ioc.getBean(EmployeeService.class);

    @Test
    public void selectOne() {
        Employee employee = new Employee(null, "bob", 5560.11000, null);
        Employee employeeResult = employeeService.selectOne(employee);
        System.out.println(employeeResult);

    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void existsWithPrimaryKey() {
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectCount() {
    }

    @Test
    public void select() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectCountByExample() {
    }

    @Test
    public void selectOneByExample() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void selectByExampleAndRowBounds() {
    }

    @Test
    public void selectByRowBounds() {
    }
}