package com.cyborg.springboot.cruddemo.dao;

import com.cyborg.springboot.cruddemo.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

    // that's it.... no need to write any code LOL!
}
