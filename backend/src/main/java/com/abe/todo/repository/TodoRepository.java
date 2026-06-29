package com.abe.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abe.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
