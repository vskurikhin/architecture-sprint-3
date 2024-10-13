package ru.yandex.practicum.smarthome.auth.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class Users {
    @Id
    private String id;
}