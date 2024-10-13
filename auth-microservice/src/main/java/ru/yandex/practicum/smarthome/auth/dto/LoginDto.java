package ru.yandex.practicum.smarthome.auth.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String login;
    private String password;
}