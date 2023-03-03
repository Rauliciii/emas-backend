package org.europol.eu.emas.emasbackend.service;


import org.europol.eu.emas.emasbackend.model.Role;
import org.europol.eu.emas.emasbackend.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findUserByUsername(String email);

    void changeRole(Role newRole, String email);

    List<User> findAll();
}
