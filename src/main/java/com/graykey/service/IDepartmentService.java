package com.graykey.service;

import com.graykey.module.Department;

import java.util.List;

public interface IDepartmentService {

    Department addDepartment(Department department);

    void delDepartment(String id);

    Department updateDepartment(Department department);

    Department queryDepartment(String id);

    List<Department> queryDepartmentList();
}
