package com.example.demo.user.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private Long id;
    
    private String username;
    
    private String email;
    
    private String name;
    
    @EqualsAndHashCode.Exclude
    private OffsetDateTime createdAt;
    
    @EqualsAndHashCode.Exclude
    private OffsetDateTime modifiedAt;
}
