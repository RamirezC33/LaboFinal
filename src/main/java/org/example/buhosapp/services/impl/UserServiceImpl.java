package org.example.buhosapp.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.buhosapp.common.mappers.UserMapper;
import org.example.buhosapp.domain.dtos.request.user.CreateUserRequest;
import org.example.buhosapp.domain.dtos.response.user.UserResponse;
import org.example.buhosapp.repositories.UserRepository;
import org.example.buhosapp.services.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse createUser(CreateUserRequest createUserRequest) {
        return userMapper.toDto(
                userRepository.save(
                        userMapper.toEntityCreate(createUserRequest)
                )
        );
    }
}
