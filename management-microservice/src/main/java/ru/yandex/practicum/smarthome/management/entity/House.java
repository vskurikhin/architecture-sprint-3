package ru.yandex.practicum.smarthome.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "house")
@Data
public class House {
    @Id
    private UUID id;

    @Column(nullable = false)
    private String deviceId;

    @Column(nullable = false)
    private String userId;
}