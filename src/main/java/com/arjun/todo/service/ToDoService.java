package com.arjun.todo.service;

import java.util.List;
import java.util.Optional;

import com.arjun.todo.model.ToDo;

public interface ToDoService {
	public List<ToDo> getAllToDo();

	public Optional<ToDo> getToDoById(long id);

	public ToDo saveToDo(ToDo todo);

	public void removeToDo(ToDo todo);
}
