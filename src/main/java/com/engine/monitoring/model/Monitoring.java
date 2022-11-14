package com.engine.monitoring.model;

import javax.persistence.*;

@Entity
@Table(name = "Monitoring")
public class Monitoring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "monitoring_id")
    private int monitoring_id;
    @Column(name = "username")
    private String username;
    @Column(name = "project_id")
    private int project_id;
    @Column(name = "server_id")
    private int server_id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private int type;
    @Column(name = "port")
    private int port;
    @Column(name = "haproxy")
    private int haproxy;
    @Column(name = "haproxy_port")
    private int haproxy_port;
    @Column(name = "path")
    private String path;
    @Column(name = "git_url")
    private String git_url;
    @Column(name = "running_on")
    private int running_on;
    @Column(name = "running_command")
    private String running_command;
    @Column(name = "last_update")
    private int last_update;

    public Monitoring() {
    }

    public int getMonitoring_id() {
        return monitoring_id;
    }

    public void setMonitoring_id(int monitoring_id) {
        this.monitoring_id = monitoring_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getServer_id() {
        return server_id;
    }

    public void setServer_id(int server_id) {
        this.server_id = server_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getHaproxy() {
        return haproxy;
    }

    public void setHaproxy(int haproxy) {
        this.haproxy = haproxy;
    }

    public int getHaproxy_port() {
        return haproxy_port;
    }

    public void setHaproxy_port(int haproxy_port) {
        this.haproxy_port = haproxy_port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getGit_url() {
        return git_url;
    }

    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    public int getRunning_on() {
        return running_on;
    }

    public void setRunning_on(int running_on) {
        this.running_on = running_on;
    }

    public String getRunning_command() {
        return running_command;
    }

    public void setRunning_command(String running_command) {
        this.running_command = running_command;
    }

    public int getLast_update() {
        return last_update;
    }

    public void setLast_update(int last_update) {
        this.last_update = last_update;
    }
}
