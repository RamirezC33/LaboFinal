package org.example.buhosapp.services;

import org.example.buhosapp.domain.dtos.request.role.CreateRoleRequest;

public interface RoleService {
    void createRole(CreateRoleRequest roleRequest);
}
