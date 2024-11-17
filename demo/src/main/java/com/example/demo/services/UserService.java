package com.example.demo.services;

import com.example.demo.dtos.CredentialsDto;
import com.example.demo.dtos.SignUpDto;
import com.example.demo.dtos.UserDto;
import com.example.demo.entites.User;
import com.example.demo.exceptions.AppException;
import com.example.demo.mappers.UserMapper;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

//    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final UserMapper userMapper;

    public UserDto login(CredentialsDto credentialsDto) {
//        User user = userRepository.findByLogin(credentialsDto.login())
//                .orElseThrow(() -> new AppException("Unknown user", HttpStatus.NOT_FOUND));

        User user = new User(1L, "damitha", "john.doe", "$2a$10$ts5996Lgq2XReEsH9nyFr.qt0/7tsanzE6hxBx/vCbfUf5xgK.2Ry");

        if (passwordEncoder.matches(CharBuffer.wrap(credentialsDto.password()), user.getPassword())) {
            return userMapper.toUserDto(user);
        }
        throw new AppException("Invalid password", HttpStatus.BAD_REQUEST);
    }

    public UserDto register(SignUpDto userDto) {
//        Optional<User> optionalUser = userRepository.findByLogin(userDto.login());
//
//        if (optionalUser.isPresent()) {
//            throw new AppException("Login already exists", HttpStatus.BAD_REQUEST);
//        }
//
//        User user = userMapper.signUpToUser(userDto);
//        user.setPassword(passwordEncoder.encode(CharBuffer.wrap(userDto.password())));
//
//        User savedUser = userRepository.save(user);

        return userMapper.toUserDto(null);
    }
//
    public UserDto findByLogin(String login) {
//        User user = userRepository.findByLogin(login)
//                .orElseThrow(() -> new AppException("Unknown user", HttpStatus.NOT_FOUND));
        User user = new User(1L, "damitha", "john.doe", "$2a$10$ts5996Lgq2XReEsH9nyFr.qt0/7tsanzE6hxBx/vCbfUf5xgK.2Ry");

        return userMapper.toUserDto(user);
    }

}
