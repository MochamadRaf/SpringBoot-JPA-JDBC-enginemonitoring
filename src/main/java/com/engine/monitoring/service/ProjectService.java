package com.engine.monitoring.service;

import com.engine.monitoring.model.Project;

import java.util.List;

public interface ProjectService {

    public void createProject(Project project);

    public void updateProject(Project project);

    public void deleteProject(int project_id);

    public List<Project> getProjects();

    public Project getProjectById(int id);
}
