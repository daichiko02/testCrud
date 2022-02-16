package com.example.demo.user;

import com.example.demo.user.execption.UserNotFoundException;
import com.example.demo.user.response.UserResponseDto;
import com.example.demo.util.ConverterHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public List<User> fetchAll(){
        return userRepository.findAll();
    }
    
    public UserResponseDto addUser(User user) {
        return ConverterHelper.convertObject(userRepository.save(user), UserResponseDto.class);
    }
    
    public UserResponseDto fetchUserById(Long id) {
        return ConverterHelper.convertObject(userRepository.findById(id).orElseThrow(UserNotFoundException::new), UserResponseDto.class);
    }
}
