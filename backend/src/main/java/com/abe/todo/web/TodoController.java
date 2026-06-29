package com.abe.todo.web;

import org.springframework.web.bind.annotation.*;
import com.abe.todo.service.TodoService;
import com.abe.todo.entity.Todo;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
  private final TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping()
  public List<Todo> getTodos() {
    return todoService.findAllTodos();
  }

  @PostMapping()
  public Todo createTodo(@RequestBody CreateTodoRequest request) {
    return todoService.createTodo(request.task());

  }

  public record CreateTodoRequest(String task) {
  }

}
