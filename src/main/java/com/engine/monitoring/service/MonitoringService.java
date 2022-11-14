package com.engine.monitoring.service;

import com.engine.monitoring.model.Monitoring;

import java.util.List;

public interface MonitoringService {

    public List<Monitoring> getMonitorings();
    public void updateMonitoring(Monitoring monitoring);
    public Monitoring getMonitoringById(int id);
}
