package com.finalApp.EmployeesApp.service;

import com.finalApp.EmployeesApp.dto.UserRegistrationDto;
import com.finalApp.EmployeesApp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
