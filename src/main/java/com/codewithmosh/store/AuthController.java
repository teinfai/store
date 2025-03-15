package com.codewithmosh.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {
        private final JWTUtil jwtUtil;

        public AuthController (JWTUtil jwtUtil) {
            this.jwtUtil = jwtUtil;
        }

        @GetMapping("/token")
        public String getToken(@RequestParam String username) {
            return jwtUtil.generateToken(username);
        }

}


