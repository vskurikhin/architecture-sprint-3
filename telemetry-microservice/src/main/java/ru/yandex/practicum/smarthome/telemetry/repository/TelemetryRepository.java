package ru.yandex.practicum.smarthome.telemetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.smarthome.telemetry.entity.Devices;

@Repository
public interface TelemetryRepository extends JpaRepository<Devices, Long> {
}
