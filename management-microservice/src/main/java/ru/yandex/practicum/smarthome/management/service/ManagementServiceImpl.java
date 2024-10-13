package ru.yandex.practicum.smarthome.management.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.smarthome.management.dto.SmartSystemDevicesDto;
import ru.yandex.practicum.smarthome.management.entity.Devices;
import ru.yandex.practicum.smarthome.management.exception.NotImplementedException;
import ru.yandex.practicum.smarthome.management.repository.ManagementRepository;

@Service
@RequiredArgsConstructor
public class ManagementServiceImpl implements ManagementService {
    private final ManagementRepository managementRepository;

    @Override
    public SmartSystemDevicesDto getHeatingSystem(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public SmartSystemDevicesDto updateHeatingSystem(Long id, SmartSystemDevicesDto smartSystemDevicesDto) {
        throw new NotImplementedException();
    }

    @Override
    public void turnOn(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public void turnOff(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public void setTargetTemperature(Long id, double temperature) {
        throw new NotImplementedException();
    }

    @Override
    public Double getCurrentTemperature(Long id) {
        throw new NotImplementedException();
    }

    private SmartSystemDevicesDto convertToDto(Devices devices) {
        throw new NotImplementedException();
    }
}