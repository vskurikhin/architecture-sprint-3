package ru.yandex.practicum.smarthome.auth.service;

import ru.yandex.practicum.smarthome.auth.dto.LoginDto;

public interface AuthService {
    LoginDto getHeatingSystem(Long id);
    LoginDto updateHeatingSystem(Long id, LoginDto smartSystemDevicesDto);
}