package com.example.demo.entites;

//import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Builder
//@Data
//@Entity
//@Table(name = "app_user")
public class User {

    private Long id;

    private String userName;

    private String login;

    private String password;
}
