package org.example.buhosapp.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.buhosapp.common.mappers.RoleMapper;
import org.example.buhosapp.domain.dtos.request.role.CreateRoleRequest;
import org.example.buhosapp.repositories.RoleRepository;
import org.example.buhosapp.services.RoleService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    @Override
    public void createRole(CreateRoleRequest roleRequest) {
        roleRepository.save(roleMapper.toEntityCreate(roleRequest));
    }
}
