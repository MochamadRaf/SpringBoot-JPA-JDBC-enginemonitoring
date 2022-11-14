package com.engine.monitoring.dao;

import com.engine.monitoring.model.Project;


import java.util.List;
import java.util.Optional;

public interface ProjectDAO {
    int save(Project project);

    int update(Project project);

    int delete(int project_id);

    List<Project> findAll();

    Optional<Project> findById(int project_id);
}
