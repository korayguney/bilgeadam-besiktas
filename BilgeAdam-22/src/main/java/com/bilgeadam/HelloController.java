package com.bilgeadam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @Value("${developer.name}")
    private String nameOfDeveloper;

    @GetMapping("/developer")
    public String getNameOfDeveloper(){
        return " Developer name : " + nameOfDeveloper;
    }

    // produces = MediaType.APPLICATION_XML_VALUE ile de dene
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public StringResponse sayHello(@RequestParam String name, @PathParam("year") int year) {
        return new StringResponse("Hello from my first Spring Boot project! " + name + " " + year);
    }

    @GetMapping(value = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayMyName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/greeting/{id}")
    public ResponseEntity<String> greeting(@RequestHeader("User-Agent") String userAgent, @PathVariable int id) {

        if (id > 100) {
            return ResponseEntity.badRequest().body("ID cannot greater then 100");
            // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("ID cannot greater then 100");
            //return new ResponseEntity<>("ID cannot greater then 100", HttpStatus.BAD_REQUEST);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("my-custom-header", "5000");

        //return ResponseEntity.ok().headers(headers).body("Welcome...");
        //return ResponseEntity.ok("Welcome...");
        return new ResponseEntity<>("Welcome, User-Agent : " + userAgent, headers, HttpStatus.OK);
    }

    @GetMapping("/custom")
    public void customHeader(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String cookie = request.getHeader("Cookie");

        response.setHeader("custom-header", "Koray");
        response.setHeader("my-cookie", cookie);
        response.setStatus(200);
        response.getWriter().println("Hello World...");
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Koray", 111));
        students.add(new Student(2, "Furkan", 222));
        students.add(new Student(3, "Sefa", 333));
        students.add(new Student(4, "Kaan", 444));
        students.add(new Student(5, "Veli", 555));
        students.add(new Student(6, "Oguzhan", 666));

        return students;
    }

    @RequestMapping("*")
    public ResponseEntity<String> fallBckMethod() {
        return new ResponseEntity<>("There is no endpoint like this!!!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/calculate/{operation}")
    public String calculate(@PathVariable String operation, @PathParam("num1") int num1, @PathParam("num2") int num2) {
        int result = 0;
        String errormsg = "";

        switch (operation) {
            case "sum":
                operation = "+";
                result = num1 + num2;
                break;
            case "subtract":
                operation = "*";
                result = num1 * num2;
                break;
            case "multiply":
                operation = "-";
                result = num1 - num2;
                break;
            case "devide":
                operation = "/";
                result = num1 / num2;
                break;
            default:
                errormsg = "Operation is not supported!";
                break;
        }

        if(errormsg.length() > 0) return errormsg;
        return String.format("%d %s %d = %d", num1, operation, num2, result);

    }

}
