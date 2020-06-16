package com.example.restservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//声明这个class是和database读写数据的
//系统会自动生成，所以是interface不需要我们自己做
//<object, id>

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
