package com.chen.service.impl;

import com.chen.dao.IEmployeeDao;
import com.chen.dao.impl.EmployeeDaoImpl;
import com.chen.domain.Employee;
import com.chen.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {

    private IEmployeeDao iEmployeeDao = new EmployeeDaoImpl();

    @Override
    public Employee selectById(Long id) {
        return iEmployeeDao.selectById(id);
    }

    @Override
    public List<Employee> selectAll() {
        return iEmployeeDao.selectAll();
    }

    @Override
    public int insert(Employee employee) {
        return iEmployeeDao.insert(employee);
    }

    @Override
    public int update(Employee employee) {
        return iEmployeeDao.update(employee);
    }

    @Override
    public int deleteById(Long id) {
        return iEmployeeDao.deleteById(id);
    }
}
