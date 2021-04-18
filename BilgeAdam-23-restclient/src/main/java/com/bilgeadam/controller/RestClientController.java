package com.bilgeadam.controller;

import com.bilgeadam.model.Todo;
import com.bilgeadam.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class RestClientController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    TodoRepository repository;

    @GetMapping("/get/{id}")
    public ResponseEntity<Todo> getJsonFromRemoteTodoList(@PathVariable Integer id) {
        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/" + id, Todo.class);
        todo.setLocalDate(LocalDate.now());
        repository.save(todo);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @GetMapping("/getStr/{id}")
    public ResponseEntity<String> getJsonFromRemoteTodoListWithString(@PathVariable Integer id) {
        ResponseEntity<String> todo = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos/" + id, String.class);
        return todo;
    }

}
