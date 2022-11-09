package com.chen.dao;

import com.chen.domain.Employee;

import java.util.List;

public interface IEmployeeDao {

    Employee selectById(Long id);

    List<Employee> selectAll();

    int insert(Employee employee);

    int update(Employee employee);

    int deleteById(Long id);

}
