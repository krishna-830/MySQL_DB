package com.cjc.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DAO.EmployeeDao;
import com.cjc.Model.Employee;
import com.cjc.Service.EmployeeService;
@Service
public class EmployeeServiceIMPL  implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee addEmployee(Employee employee) {
	
		return dao.save(employee);
	}

}
