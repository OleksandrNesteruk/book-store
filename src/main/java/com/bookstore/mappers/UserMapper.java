package com.bookstore.mappers;

import com.bookstore.dto.user.UserResponseDto;
import com.bookstore.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponseDto mapToDto(User user);
}
