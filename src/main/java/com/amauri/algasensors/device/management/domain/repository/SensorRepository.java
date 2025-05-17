package com.amauri.algasensors.device.management.domain.repository;

import com.amauri.algasensors.device.management.domain.model.Sensor;
import com.amauri.algasensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
