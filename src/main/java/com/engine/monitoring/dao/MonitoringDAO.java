package com.engine.monitoring.dao;

import com.engine.monitoring.model.Monitoring;

import java.util.List;
import java.util.Optional;

public interface MonitoringDAO {

    List<Monitoring> findAll();

    int update(Monitoring monitoring);

    Optional<Monitoring> findById(int monitoring_id);
}
