package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired // This connects the repository
    private UserRepository userRepository;

    @GetMapping("/save")
    public String saveUser(@RequestParam String name) {
        UserEntity user = new UserEntity();
        user.setUsername(name);
        userRepository.save(user); // This sends it to the DB!
        return "Saved " + name + " to the database!";
    }

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Success!</h1><p>Your Spring Boot app is running on Java 26.</p>";
    }

    @GetMapping("/greet")
    public String greetUser(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return String.format("<h1>Hello, %s!</h1><p>You are now passing data to Spring Boot.</p>", name);
    }
}