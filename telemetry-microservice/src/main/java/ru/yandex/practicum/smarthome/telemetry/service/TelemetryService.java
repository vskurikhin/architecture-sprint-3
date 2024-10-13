package ru.yandex.practicum.smarthome.telemetry.service;

import ru.yandex.practicum.smarthome.telemetry.dto.SmartSystemDevicesDto;

public interface TelemetryService {
    SmartSystemDevicesDto getHeatingSystem(Long id);
    SmartSystemDevicesDto updateHeatingSystem(Long id, SmartSystemDevicesDto smartSystemDevicesDto);
    void turnOn(Long id);
    void turnOff(Long id);
    void setTargetTemperature(Long id, double temperature);
    Double getCurrentTemperature(Long id);
}