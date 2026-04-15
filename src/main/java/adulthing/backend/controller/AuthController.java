package adulthing.backend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import adulthing.backend.dto.LoginRequest;

@RestController
public class AuthController {
    @GetMapping("/auth/login")
    public String loginInfo() {
        return "public endpoint";
    }

    @PostMapping("/auth/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return loginRequest.getUsername() + " " + loginRequest.getPassword();
    }
}
