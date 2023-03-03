package org.europol.eu.emas.emasbackend.service;


import jakarta.transaction.Transactional;
import org.europol.eu.emas.emasbackend.model.Role;
import org.europol.eu.emas.emasbackend.model.User;
import org.europol.eu.emas.emasbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (user.getRole() == null) {
            user.setRole(Role.USER);
        }
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByUsername(String email) {
        return userRepository.findByUsername(email);
    }

    @Override
    @Transactional
    public void changeRole(Role newRole, String email) {
        userRepository.updateUserRole(email, newRole);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
