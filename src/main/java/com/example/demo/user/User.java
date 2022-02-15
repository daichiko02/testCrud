package com.example.demo.user;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity( name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Setter
    private String username;
    
    @Setter
    private String name;
    
    @Setter
    private String password;
    
    @Setter
    private String email;
    
    @CreationTimestamp
    @EqualsAndHashCode.Exclude
    private OffsetDateTime createdAt;
    
    @UpdateTimestamp
    @EqualsAndHashCode.Exclude
    private OffsetDateTime modifiedAt;
}
