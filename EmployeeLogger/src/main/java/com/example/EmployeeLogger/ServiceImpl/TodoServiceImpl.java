package com.example.EmployeeLogger.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeLogger.Model.Todo;
import com.example.EmployeeLogger.Repository.TodoRepository;
import com.example.EmployeeLogger.Service.todoService.TodoService;

@Service
public class TodoServiceImpl  implements TodoService{

	@Autowired
	TodoRepository todorepository;

	@Override
	public List<Todo> getAllTodos(String Username) {
		// TODO Auto-generated method stub
		
		return todorepository.findByusername(Username);	
	}

	@Override
	public String RemoveTodo(int todoid) {
		// TODO Auto-generated method stub
		
		todorepository.deleteById(todoid);
		
		return "deleted";
	}

	@Override
	public String EditTodo(int todoid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addTodos(Todo todo) {
		// TODO Auto-generated method stub	
		todorepository.save(todo);
		return "ok";
	}

	@Override
	public Todo GetTodo(int id) {
		// TODO Auto-generated method stub
		 Todo todo =new Todo();
		 todo=todorepository.findByid(id);
		
		 return todo;
	}

	@Override
	public List<Todo> ListgetAllTodo() {
		// TODO Auto-generated method stub
		return todorepository.findAll();
	}
	
	


}
