package com.bookstore.service.impl;

import com.bookstore.model.Role;
import com.bookstore.repository.role.RoleRepository;
import com.bookstore.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public Role findByRole(Role.RoleName roleName) {
        return roleRepository.findByRole(roleName)
                .orElseThrow(() -> new RuntimeException("Can't find role with name: "
                        + roleName.name()));
    }
}
