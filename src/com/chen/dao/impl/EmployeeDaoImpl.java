package com.chen.dao.impl;

import com.chen.dao.IEmployeeDao;
import com.chen.domain.Employee;
import com.chen.util.JdbcUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDaoImpl implements IEmployeeDao {
    private static final String MYSQL = "com.chen.mapper.EmployeeMapper.";

    @Override
    public Employee selectById(Long id) {
        SqlSession session = JdbcUtil.getSession();
        Employee emp = session.selectOne(EmployeeDaoImpl.MYSQL + "selectById", id);
        return emp;
    }

    @Override
    public List<Employee> selectAll() {
        SqlSession session = JdbcUtil.getSession();
        List<Employee> employeeList = session.selectList(EmployeeDaoImpl.MYSQL + "selectAll");
        return employeeList;
    }

    @Override
    public int insert(Employee employee) {
        SqlSession session = JdbcUtil.getSession();
        int insert = session.insert(EmployeeDaoImpl.MYSQL + "insert", employee);
        return insert;
    }

    @Override
    public int update(Employee employee) {
        SqlSession session = JdbcUtil.getSession();
        int update = session.update(EmployeeDaoImpl.MYSQL + "update", employee);
        return update;
    }

    @Override
    public int deleteById(Long id) {
        SqlSession session = JdbcUtil.getSession();
        int delete = session.delete(EmployeeDaoImpl.MYSQL + "deleteById", id);
        return delete;
    }
}
