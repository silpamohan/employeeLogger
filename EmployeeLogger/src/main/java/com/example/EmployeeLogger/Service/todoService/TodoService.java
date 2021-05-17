package com.example.EmployeeLogger.Service.todoService;

import java.util.List;

import com.example.EmployeeLogger.Model.Todo;



public interface TodoService {
	
	public List<Todo> getAllTodos(String Username);

	public  String RemoveTodo(int todoid);

	public  String EditTodo(int todoid);

	public  String addTodos(Todo todo);
	
	public Todo GetTodo(int id);
	
	public List<Todo> ListgetAllTodo();
	


}
