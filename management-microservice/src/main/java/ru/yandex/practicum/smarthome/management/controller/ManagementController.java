package ru.yandex.practicum.smarthome.management.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.smarthome.management.dto.SmartSystemDevicesDto;
import ru.yandex.practicum.smarthome.management.service.ManagementService;

@RestController
@RequestMapping("/api/v1/devices")
@RequiredArgsConstructor
public class ManagementController {

    private final ManagementService managementService;

    private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

    @GetMapping("/{id}")
    public ResponseEntity<SmartSystemDevicesDto> get(@PathVariable("id") Long id) {
        logger.info("Fetching with id {}", id);
        var smartSystemDevicesDto = new SmartSystemDevicesDto();
        return ResponseEntity.ok(smartSystemDevicesDto);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<SmartSystemDevicesDto> status(@PathVariable("id") Long id,
                                                        @RequestBody SmartSystemDevicesDto smartSystemDevicesDto) {
        logger.info("Status with id {}", id);
        return ResponseEntity.ok(smartSystemDevicesDto);
    }

    @PutMapping("/{id}/commands")
    public ResponseEntity<SmartSystemDevicesDto> commands(@PathVariable("id") Long id,
                                                          @RequestBody SmartSystemDevicesDto smartSystemDevicesDto) {
        logger.info("Commands with id {}", id);
        return ResponseEntity.ok(smartSystemDevicesDto);
    }
}
