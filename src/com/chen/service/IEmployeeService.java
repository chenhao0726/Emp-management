package com.chen.service;

import com.chen.domain.Employee;

import java.util.List;

public interface IEmployeeService {

    Employee selectById(Long id);

    List<Employee> selectAll();

    int insert(Employee employee);

    int update(Employee employee);

    int deleteById(Long id);

}
