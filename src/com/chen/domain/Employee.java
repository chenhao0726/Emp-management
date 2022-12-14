package com.chen.domain;

import java.math.BigDecimal;

public class Employee {

    private Long id;
    private String name;
    private String password;
    private Integer age;
    private Integer gender;
    private String phone;
    private Double salary;
    private String address;
    private Integer dept_id;

    public Employee() {

    }

    public Employee(Long id, String name, String password, Integer age, Integer gender, String phone, Double salary, String address, Integer dept_id) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.salary = salary;
        this.address = address;
        this.dept_id = dept_id;
    }

    public Employee(String name, String password, Integer age, Integer gender, String phone, Double salary, String address, Integer dept_id) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.salary = salary;
        this.address = address;
        this.dept_id = dept_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", dept_id=" + dept_id +
                '}';
    }
}
