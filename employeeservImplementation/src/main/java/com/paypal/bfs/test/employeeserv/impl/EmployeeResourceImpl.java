package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.entity.Address;
import com.paypal.bfs.test.employeeserv.repository.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {

        Optional<com.paypal.bfs.test.employeeserv.entity.Employee> employeeEntity = employeeRepo.findById(id);

        if (employeeEntity.isPresent()) {
            Employee employee = modelMapper.map(employeeEntity.get(), Employee.class);
            return ResponseEntity.status(HttpStatus.CREATED).body(employee);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(null);

    }

    @Override
    public ResponseEntity<Employee> createEmployee(Employee employee) {

       try {
           System.out.println(employee.toString());
           com.paypal.bfs.test.employeeserv.entity.Employee employeeEntity = modelMapper.map(employee, com.paypal.bfs.test.employeeserv.entity.Employee.class);
           employeeEntity = employeeRepo.save(employeeEntity);

           if (employeeEntity != null) {
               employee = modelMapper.map(employeeEntity, Employee.class);
               return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
           }
           return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
       } catch (Exception e) {
           return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
       }


    }

}
