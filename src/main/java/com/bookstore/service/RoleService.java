package com.bookstore.service;

import com.bookstore.model.Role;

public interface RoleService {
    Role findByRole(Role.RoleName roleName);
}
