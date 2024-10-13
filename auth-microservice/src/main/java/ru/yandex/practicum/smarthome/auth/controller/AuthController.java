package ru.yandex.practicum.smarthome.auth.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.smarthome.auth.dto.LoginDto;
import ru.yandex.practicum.smarthome.auth.service.AuthService;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @PostMapping("/{login}")
    public ResponseEntity<LoginDto> get(@PathVariable("login") String login, @RequestBody LoginDto loginDto) {
        logger.info("Fetching with id {}", login);
        return ResponseEntity.ok(loginDto);
    }
}
