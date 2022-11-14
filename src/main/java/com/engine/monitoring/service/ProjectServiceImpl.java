package com.engine.monitoring.service;

import com.engine.monitoring.dao.ProjectDAOImpl;
import com.engine.monitoring.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDAOImpl projectDAO;

    public void createProject(Project project) {
        projectDAO.save(project);
    }

    public void updateProject(Project project) {
        projectDAO.update(project);
    }

    public void deleteProject(int project_id) {
        projectDAO.delete(project_id);
    }

    public List<Project> getProjects() {

        return projectDAO.findAll();
    }

    public Project getProjectById(int project_id) {

        Project project = new Project();
        Optional<Project> existingProject = projectDAO.findById(project_id);
        if (existingProject.isPresent())
            project = existingProject.get();
        return project;
    }
}
