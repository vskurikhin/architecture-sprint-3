package ru.yandex.practicum.smarthome.telemetry.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.smarthome.telemetry.dto.SmartSystemDevicesDto;
import ru.yandex.practicum.smarthome.telemetry.entity.Devices;
import ru.yandex.practicum.smarthome.telemetry.exception.NotImplementedException;
import ru.yandex.practicum.smarthome.telemetry.repository.TelemetryRepository;

@Service
@RequiredArgsConstructor
public class TelemetryServiceImpl implements TelemetryService {
    private final TelemetryRepository telemetryRepository;
    
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