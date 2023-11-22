package com.bookstore.dto.user;

import com.bookstore.validation.Email;
import com.bookstore.validation.FieldsValueMatch;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@FieldsValueMatch(field = "password", fieldMatch = "repeatPassword",
        message = "Incorrect password")
@Getter
@Setter
public class UserRegistrationRequestDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min = 8, max = 20)
    private String password;
    @NotBlank
    @Size(min = 8, max = 20)
    private String repeatPassword;
    @Size(max = 100)
    private String shippingAddress;
}
