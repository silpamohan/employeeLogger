package com.example.EmployeeLogger.Controller;

import org.springframework.http.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeLogger.Model.Todo;
import com.example.EmployeeLogger.Service.todoService.TodoService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeLoggerController {

	
	  @Autowired 
	  TodoService todoservice;
	


/*@GetMapping("/employeelist")
 * public Employer getEmployee() {
 * 
 * List<String> branchNames=new ArrayList<String>(); branchNames.add("anju");
 * //public Employer(int id,String Country , List<String> branchNames, int
 * mobile, String mailid) return new
 * Employer(1,"tcs","india",branchNames,123456,"silpamohan8396@gmail.com");
 * 
 * //throw new RuntimeException("some error has happened"); }
 */
	
@GetMapping(path="/todolist/{username}")
public List<Todo> getAlltodos(@PathVariable String username)
{
List<Todo> todolist =new ArrayList<Todo>();	
//todolist=

todolist=todoservice.getAllTodos(username);

return todolist;
	
}
@GetMapping(path="/todolist")
@CrossOrigin(origins="http://localhost:4200")
public List<Todo> getAlltodo()
{
List<Todo> todolist =new ArrayList<Todo>();	
//todolist=

todolist=todoservice.ListgetAllTodo();

return todolist;

}




@DeleteMapping(path="/deleteById/{id}")
public ResponseEntity<Void> deleteTodos(@PathVariable int id) {
	
	todoservice.RemoveTodo(id);
	return ResponseEntity.noContent().build();
}


@GetMapping(path="/getById/{id}")
public Todo getTodoById(@PathVariable int id)
{
	
	return todoservice.GetTodo(id);
}

@PutMapping(path="/addTodo" ,consumes=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
	
	//todoservice.RemoveTodo(todo.getId());
	todoservice.addTodos(todo);
	return new ResponseEntity<Todo>(todo,HttpStatus.OK);
	
}

}