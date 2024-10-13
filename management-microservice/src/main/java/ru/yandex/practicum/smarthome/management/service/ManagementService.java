package ru.yandex.practicum.smarthome.management.service;

import ru.yandex.practicum.smarthome.management.dto.SmartSystemDevicesDto;

public interface ManagementService {
    SmartSystemDevicesDto getHeatingSystem(Long id);
    SmartSystemDevicesDto updateHeatingSystem(Long id, SmartSystemDevicesDto smartSystemDevicesDto);
    void turnOn(Long id);
    void turnOff(Long id);
    void setTargetTemperature(Long id, double temperature);
    Double getCurrentTemperature(Long id);
}