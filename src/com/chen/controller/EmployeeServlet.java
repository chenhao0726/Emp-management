package com.chen.controller;

import com.chen.domain.Employee;
import com.chen.service.IEmployeeService;
import com.chen.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@WebServlet("/emp")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService service = new EmployeeServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String type = req.getParameter("type");
        System.out.println("=========" + type + "============");
        switch (type) {
            case "list":
                List<Employee> employeeList = service.selectAll();
                req.getSession().setAttribute("list",employeeList);
                // 请求转发
                req.getRequestDispatcher("/WEB-INF/views/emp/empinfor.jsp").forward(req,resp);
                break;
            case "save":
                save(req,resp);
                break;
            case "input":
                input(req,resp);
                break;
            case "delete":
                // 接收id
                String id = req.getParameter("id");
                int i = service.deleteById(Long.parseLong(id));
                System.out.println("====delete====>" + i);
                // 重定向到infor
                resp.sendRedirect("/emp?type=list");
                break;
        }
    }

    public void save(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收参数
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");
        String phone = req.getParameter("phone");
        String salary = req.getParameter("salary");
        String address = req.getParameter("address");
        String dept_id = req.getParameter("dept_id");
        // 判断id是否存在
        if (!"".equals(id) && id != null) {
            Employee employee = new Employee(Long.parseLong(id), name, password, Integer.parseInt(age), Integer.parseInt(gender),
                    phone, Double.parseDouble(salary), address, Integer.parseInt(dept_id));
            int update = service.update(employee);
            System.out.println("====update====>" + update);
            req.getSession().setAttribute("msg",update);
        } else {
            Employee employee = new Employee(name, password, Integer.parseInt(age), Integer.parseInt(gender),
                    phone, Double.parseDouble(salary), address, Integer.parseInt(dept_id));
            int insert = service.insert(employee);
            System.out.println("====insert====>" + insert);
            req.getSession().setAttribute("msg",insert);
        }
        // 重定向到infor
        resp.sendRedirect("/emp?type=list");


    }

    public void input(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        // 判断id是否存在
        if (!"".equals(id) && id != null) {
            System.out.println("======id存在====");
            Employee employee = service.selectById(Long.parseLong(id));
            req.getSession().setAttribute("emp",employee);
        }
//        req.getSession().invalidate();
        String id2 = req.getParameter("id");
        String name = req.getParameter("name");
        System.out.println("==========>" + id2);
        System.out.println("==========>" + name);
        req.getRequestDispatcher("WEB-INF/views/emp/empsave.jsp").forward(req,resp);
    }
}
