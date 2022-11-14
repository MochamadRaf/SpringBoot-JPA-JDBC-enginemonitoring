package com.engine.monitoring.dao;

import com.engine.monitoring.model.Project;
;
import com.engine.monitoring.model.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProjectDAOImpl implements ProjectDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String INSERT_PROJECT_QUERY = "INSERT INTO project(project_id, project_name, keterangan, username) VALUES(?,?,?,?)";
    private final String UPDATE_PROJECT_QUERY = "UPDATE project SET project_name=?, keterangan=?,username=? WHERE project_id=?";
    private final String DELETE_PROJECT_QUERY = "DELETE FROM project WHERE project_id=?";
    private final String GET_PROJECT_BY_ID_QUERY = "SELECT * FROM project where project_id = ?";
    private final String GET_PROJECTS_QUERY = "SELECT * FROM project";

    @Override
    public int save(Project project) {

        return jdbcTemplate.update(INSERT_PROJECT_QUERY, new Object[] { project.getProject_id(), project.getProject_name(), project.getKeterangan(), project.getUsername() });
    }

    @Override
    public int update(Project project) {

        return jdbcTemplate.update(UPDATE_PROJECT_QUERY, new Object[] {project.getProject_name(), project.getKeterangan(), project.getUsername(), project.getProject_id()});
    }

    @Override
    public int delete(int project_id) {

        return jdbcTemplate.update(DELETE_PROJECT_QUERY, new Object[] {  project_id });
    }

    @Override
    public List<Project> findAll() {

        return jdbcTemplate.query(GET_PROJECTS_QUERY, new ProjectMapper());
    }

    @Override
    public Optional<Project> findById(int project_id) {

        return Optional.of(jdbcTemplate.queryForObject(GET_PROJECT_BY_ID_QUERY, new ProjectMapper(), new Object[] {project_id}));
    }
}
