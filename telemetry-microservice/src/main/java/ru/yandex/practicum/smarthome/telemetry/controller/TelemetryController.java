package ru.yandex.practicum.smarthome.telemetry.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.smarthome.telemetry.dto.SmartSystemDevicesDto;
import ru.yandex.practicum.smarthome.telemetry.service.TelemetryService;

@RestController
@RequestMapping("/api/v1/telemetry/devices/")
@RequiredArgsConstructor
public class TelemetryController {

    private final TelemetryService telemetryService;

    private static final Logger logger = LoggerFactory.getLogger(TelemetryController.class);

    @GetMapping("/{id}/latest")
    public ResponseEntity<SmartSystemDevicesDto> get(@PathVariable("id") Long id) {
        logger.info("Fetching with id {}", id);
        var smartSystemDevicesDto = new SmartSystemDevicesDto();
        smartSystemDevicesDto.setId(id);
        return ResponseEntity.ok(smartSystemDevicesDto);
    }
}
