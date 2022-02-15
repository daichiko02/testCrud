package com.example.demo.user.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto{
    @NotNull
    private String username;
    
    @NotNull
    private String password;
    
    @NotNull
    private String name;
    
    @NotNull
    private String email;
}
