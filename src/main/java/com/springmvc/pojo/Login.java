package com.springmvc.pojo;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.constraints.*;

public class Login {

    @NotBlank(message = "Cannot be empty")
    @Size(min = 4,max = 10,message = "Should have a size between 4-10")
    private String username;

    @NotEmpty(message = "Cannot be empty")
    private String password;

    @Email(message = "Not a valid emailid")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
