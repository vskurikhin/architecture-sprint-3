package ru.yandex.practicum.smarthome.management.dto;

import lombok.Data;

@Data
public class SmartSystemDevicesDto {
    private Long id;
    private boolean isOn;
    private double targetTemperature;
    private double currentTemperature;
}