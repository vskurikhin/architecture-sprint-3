package ru.yandex.practicum.smarthome.management.entity;

import jakarta.persistence.*;
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