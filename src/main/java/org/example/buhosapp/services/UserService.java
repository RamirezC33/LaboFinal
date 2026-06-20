package org.example.buhosapp.services;

import org.example.buhosapp.domain.dtos.request.user.CreateUserRequest;
import org.example.buhosapp.domain.dtos.response.user.UserResponse;

public interface UserService {
    UserResponse createUser(CreateUserRequest userRequest);
}
