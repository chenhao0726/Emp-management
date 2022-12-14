package com.chen.dao.impl;

import com.chen.dao.IEmployeeDao;
import com.chen.domain.Employee;
import com.chen.util.JdbcUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class EmployeeDaoImpl implements IEmployeeDao {
    private static final String MYSQL = "com.chen.mapper.EmployeeMapper.";
    private static final int RE = -1;

    @Override
    public Employee selectById(Long id) {
        SqlSession session = JdbcUtil.getSession();
        Employee emp = session.selectOne(EmployeeDaoImpl.MYSQL + "selectById", id);
        session.close();
        return emp;
    }

    @Override
    public List<Employee> selectAll() {
        SqlSession session = JdbcUtil.getSession();
        List<Employee> employeeList = session.selectList(EmployeeDaoImpl.MYSQL + "selectAll");
        session.close();
        return employeeList;
    }

    @Override
    public int insert(Employee employee) {
        SqlSession session = JdbcUtil.getSession();
        try {
            int insert = session.insert(EmployeeDaoImpl.MYSQL + "insert", employee);
            session.commit();
            return insert;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return RE;
    }

    @Override
    public int update(Employee employee) {
        SqlSession session = JdbcUtil.getSession();
        try {
            int update = session.update(EmployeeDaoImpl.MYSQL + "update", employee);
            session.commit();
            return update;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return RE;
    }

    @Override
    public int deleteById(Long id) {
        SqlSession session = JdbcUtil.getSession();
        try {
            int delete = session.delete(EmployeeDaoImpl.MYSQL + "deleteById", id);
            session.commit();
            return delete;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return RE;
    }
}
