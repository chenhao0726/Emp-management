package com.chen.controller;

import com.chen.domain.Employee;
import com.chen.service.IEmployeeService;
import com.chen.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/emp/list")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService service = new EmployeeServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employeeList = service.selectAll();
        req.getSession().setAttribute("list",employeeList);
        req.getRequestDispatcher("/WEB-INF/emplist.jsp").forward(req,resp);
    }
}
