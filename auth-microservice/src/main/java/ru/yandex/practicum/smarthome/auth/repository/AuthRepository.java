package ru.yandex.practicum.smarthome.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.smarthome.auth.entity.Users;

@Repository
public interface AuthRepository extends JpaRepository<Users, Long> {
}
