package com.example.jwttemplate.auth;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/signup")
    public ResponseEntity<?> handleSignup(@RequestBody String username, String password) {
        if (StringUtils.isAnyBlank(username, password)) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("dd");

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
