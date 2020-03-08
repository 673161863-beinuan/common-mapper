package com.atguigu.mapper;

import com.atguigu.javabean.Employee;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EmployeeDao extends Mapper<Employee> {

}
