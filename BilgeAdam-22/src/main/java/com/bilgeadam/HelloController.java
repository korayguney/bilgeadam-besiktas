package com.bilgeadam;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello(@PathParam("name") String name, @PathParam("year") int year){
        return "Hello from my first Spring Boot project! " + name + " " + year;
    }

    @GetMapping(value = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayMyName(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/greeting/{id}")
    public ResponseEntity<String> greeting(@RequestHeader("User-Agent") String userAgent, @PathVariable int id){

        if(id > 100) {
            return ResponseEntity.badRequest().body("ID cannot greater then 100");
            //return new ResponseEntity<>("ID cannot greater then 100", HttpStatus.BAD_REQUEST);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("my-custom-header","5000");

        //return ResponseEntity.ok().headers(headers).body("Welcome...");
        //return ResponseEntity.ok("Welcome...");
        return new ResponseEntity<>("Welcome, User-Agent : " + userAgent, headers,HttpStatus.OK);
    }

    @GetMapping("/custom")
    public void customHeader(HttpServletResponse response) throws IOException {
        response.setHeader("custom-header","Koray");
        response.setStatus(200);
        response.getWriter().println("Hello World...");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Koray",111));
        students.add(new Student(2,"Furkan",222));
        students.add(new Student(3,"Sefa",333));
        students.add(new Student(4,"Kaan",444));
        students.add(new Student(5,"Veli",555));
        students.add(new Student(6,"Oguzhan",666));

        return students;
    }

    @RequestMapping("*")
    public ResponseEntity<String> fallBckMethod(){
        return new ResponseEntity<>("There is no endpoint like this!!!",HttpStatus.NOT_FOUND);
    }

}
