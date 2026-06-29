package com.abe.todo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.abe.todo.repository.TodoRepository;
import com.abe.todo.entity.Todo;

@Service
public class TodoService {

  private final TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> findAllTodos() {
    return todoRepository.findAll();
  }

  public Todo createTodo(String task) {
    Todo todo = new Todo(task);
    return todoRepository.save(todo);
  }

}
