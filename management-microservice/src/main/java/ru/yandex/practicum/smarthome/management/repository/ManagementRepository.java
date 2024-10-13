package ru.yandex.practicum.smarthome.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.smarthome.management.entity.Devices;

@Repository
public interface ManagementRepository extends JpaRepository<Devices, Long> {
}
