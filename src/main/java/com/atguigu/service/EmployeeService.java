package com.atguigu.service;

import com.atguigu.javabean.Employee;
import com.atguigu.mapper.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee selectOne(Employee employee) {
        return employeeDao.selectOne(employee);
    }
}
