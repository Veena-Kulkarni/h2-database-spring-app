package com.example.demo;

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
