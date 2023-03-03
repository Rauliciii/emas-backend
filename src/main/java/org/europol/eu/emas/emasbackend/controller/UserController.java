package org.europol.eu.emas.emasbackend.controller;

import org.europol.eu.emas.emasbackend.model.Role;
import org.europol.eu.emas.emasbackend.security.service.UserDetailsImpl;
import org.europol.eu.emas.emasbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("change/{role}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserDetailsImpl userDetails, @PathVariable Role role) {
        userService.changeRole(role, userDetails.getUsername());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

}
