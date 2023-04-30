package com.example.myProjectBattery.controller;

import com.example.myProjectBattery.data.Battery;
import com.example.myProjectBattery.repository.BatteryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/batteries")
public class BatteryController {

    private final BatteryRepository batteryRepository;

    public BatteryController(BatteryRepository batteryRepository) {
        this.batteryRepository = batteryRepository;

        this.batteryRepository.saveAll(List.of(
                new Battery("Battery1"),
                new Battery("Battery2"),
                new Battery("Battery3"),
                new Battery("Battery4")
        ));
    }


    @GetMapping
    Iterable<Battery> getBattery() {
        return batteryRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Battery> getBatteryById(@PathVariable int id) {
        return batteryRepository.findById(id);
    }

    @PostMapping
    Battery postBattery(@RequestBody Battery battery) {
        return batteryRepository.save(battery);
    }


    @PutMapping("/{id}")
    ResponseEntity<Battery> putBattery(@PathVariable int id, @RequestBody Battery battery) {
        return (!batteryRepository.existsById(id))
                ? new ResponseEntity<>(batteryRepository.save(battery),
                HttpStatus.CREATED)
                : new ResponseEntity<>(batteryRepository.save(battery), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    void deleteBattery(@PathVariable int id) {
        batteryRepository.deleteById(id);
    }
}
