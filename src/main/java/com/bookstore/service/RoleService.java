package com.bookstore.service;

import com.bookstore.model.Role;

public interface RoleService {
    Role findByRoleName(Role.RoleName roleName);
}
