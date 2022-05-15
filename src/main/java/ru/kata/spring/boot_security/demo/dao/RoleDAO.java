package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDAO {
    List<Role> getAllRoles();

    void addRole(Role role);

    Role findById(long id);

    Set<Role> findByIdRoles(List<Long> roles);

    Role getRole(String userRole);
}