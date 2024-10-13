package ru.yandex.practicum.smarthome.telemetry.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "devices")
@Data
public class Devices {
    @Id
    private String id;
    
    @Column(nullable = false)
    private UUID houseId;
    
    @Column(nullable = false)
    private String deviceType;
}