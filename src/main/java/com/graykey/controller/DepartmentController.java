package com.graykey.controller;

import com.graykey.module.Department;
import com.graykey.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentServiceImpl;


    @RequestMapping(value = "/add")
    public Department addDepartment(Department department){
        Department d = this.departmentServiceImpl.addDepartment(department);
        return d;
    }

    @RequestMapping(value = "/del")
    public void delDepartmentById(String id){
        this.departmentServiceImpl.delDepartment(id);
    }

    @RequestMapping(value = "/update")
    public Department updateDepartment(Department department){
        Department d = this.departmentServiceImpl.updateDepartment(department);
        return d;
    }

    @RequestMapping(value = "/getOneById")
    public Department queryDepartment(String id){
        Department department = this.departmentServiceImpl.queryDepartment(id);
        return department;
    }

    @RequestMapping(value = "/getAll")
    public List<Department> queryDepartmentList(){
        List<Department> departmentList = this.departmentServiceImpl.queryDepartmentList();
        return departmentList;
    }

}
