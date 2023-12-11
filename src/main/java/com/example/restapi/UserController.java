package com.example.restapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.UserRoleDto;  // Import for UserRoleDto
import com.example.service.UserRoleService;  // Import for UserRoleService

@RestController
@RequestMapping("/api/userRoles")
public class UserController {

    private final UserRoleService userRoleService;

    @Autowired
    public UserController(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @PostMapping
    public ResponseEntity<String> addUserRole(@RequestBody UserRoleDto userRoleDto) {
        // Validate and add user role using userRoleService
        userRoleService.addUserRole(userRoleDto);

        return ResponseEntity.ok("User role added successfully.");
    }

    // Add additional endpoints as needed
}
