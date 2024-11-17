package com.example.demo.mappers;


import com.example.demo.dtos.SignUpDto;
import com.example.demo.dtos.UserDto;
import com.example.demo.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
