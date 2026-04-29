
package com.example.demo;

import jakarta.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;

    // Standard practice: Add getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
}
