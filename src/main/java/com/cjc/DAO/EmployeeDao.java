package com.cjc.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.Model.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
