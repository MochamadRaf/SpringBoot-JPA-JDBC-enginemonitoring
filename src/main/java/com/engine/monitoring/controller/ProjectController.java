package com.engine.monitoring.controller;

import com.engine.monitoring.model.Project;
import com.engine.monitoring.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ProjectController {

    @Autowired
    private ProjectServiceImpl projectService;

    @PostMapping("/save-project")
    public ResponseEntity<?> createProject(@RequestBody Project project) {

        projectService.createProject(project);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update-project")
    public ResponseEntity<?> updateProject(@RequestBody Project project) {

        projectService.updateProject(project);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int project_id) {

        projectService.deleteProject(project_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getProjects() {

        List<Project> users = projectService.getProjects();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<?> getProjectById(@PathVariable("id") int project_id) {

        Project project = projectService.getProjectById(project_id);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }
}
