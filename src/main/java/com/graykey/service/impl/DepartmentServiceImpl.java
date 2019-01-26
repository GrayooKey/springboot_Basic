package com.graykey.service.impl;

import com.graykey.dao.DepartmentRepository;
import com.graykey.module.Department;
import com.graykey.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "departmentServiceImpl")
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department addDepartment(Department department) {
        Department d = this.departmentRepository.save(department);
        return d;
    }

    @Override
    public void delDepartment(String id) {
        this.departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartment(Department department) {
        Department d = this.departmentRepository.saveAndFlush(department);
        return d;
    }

    @Override
    public Department queryDepartment(String id) {
        /*Department department = this.departmentRepository.getOne(id);*/
        Department department = this.departmentRepository.findById(id).get();
        return department;
    }

    @Override
    public List<Department> queryDepartmentList() {
        List<Department> departmentList = this.departmentRepository.findAll();
        return departmentList;
    }

}
