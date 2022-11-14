package com.engine.monitoring.service;

import com.engine.monitoring.dao.MonitoringDAOImpl;
import com.engine.monitoring.model.Monitoring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonitoringServiceImpl implements MonitoringService {

    @Autowired
    private MonitoringDAOImpl monitoringDAO;

    public void updateMonitoring(Monitoring monitoring) {
        monitoringDAO.update(monitoring);
    }

    public List<Monitoring> getMonitorings() {

        return monitoringDAO.findAll();}

    public Monitoring getMonitoringById(int monitoring_id) {

        Monitoring monitoring = new Monitoring();
        Optional<Monitoring> existingMonitoring = monitoringDAO.findById(monitoring_id);
        if (existingMonitoring.isPresent())
            monitoring = existingMonitoring.get();
        return monitoring;
    }


}
