package com.example.myProjectBattery.repository;

import com.example.myProjectBattery.data.Battery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BatteryRepository extends JpaRepository<Battery, Integer> {
}
