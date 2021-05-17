package com.example.EmployeeLogger.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeLogger.Model.Todo;



public interface TodoRepository extends JpaRepository<Todo,Integer> {

	List<Todo> findByusername(String username);

     public Todo findByid(int id);


}
