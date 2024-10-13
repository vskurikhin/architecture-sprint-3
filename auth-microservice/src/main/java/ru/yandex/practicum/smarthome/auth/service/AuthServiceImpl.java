package ru.yandex.practicum.smarthome.auth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.smarthome.auth.dto.LoginDto;
import ru.yandex.practicum.smarthome.auth.exception.NotImplementedException;
import ru.yandex.practicum.smarthome.auth.repository.AuthRepository;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final AuthRepository authRepository;

    @Override
    public LoginDto getHeatingSystem(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public LoginDto updateHeatingSystem(Long id, LoginDto smartSystemDevicesDto) {
        throw new NotImplementedException();
    }
}