package com.example.demo.user;

import com.example.demo.user.request.UserRequestDto;
import com.example.demo.user.response.UserResponseDto;
import com.example.demo.util.ConverterHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    
    private final UserService userService;
    
    public UserController(UserService userService){
        this.userService = userService;
    }
    
    @PostMapping("/users")
    public ResponseEntity<UserResponseDto> addUser(@RequestBody @Valid UserRequestDto userDto){
        User user = ConverterHelper.convertObject(userDto, User.class);
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/users")
    public List<User> fetchAll(){
        return this.userService.fetchAll();
    }
    
    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponseDto> fetchUserById(@PathVariable("userId") Long id){
        return new ResponseEntity<>(this.userService.fetchUserById(id), HttpStatus.OK);
    }
}
