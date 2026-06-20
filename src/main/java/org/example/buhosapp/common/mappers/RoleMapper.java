package org.example.buhosapp.common.mappers;

import org.example.buhosapp.domain.dtos.request.role.CreateRoleRequest;
import org.example.buhosapp.domain.entities.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public Role toEntityCreate(CreateRoleRequest createRoleRequest) {
        return Role.builder()
                .name(createRoleRequest.getName())
                .description(createRoleRequest.getDescription())
                .build();
    }
}
