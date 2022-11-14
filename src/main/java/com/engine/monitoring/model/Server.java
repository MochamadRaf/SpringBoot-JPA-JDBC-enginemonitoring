package com.engine.monitoring.model;

import javax.persistence.*;

@Entity
@Table(name = "server")
public class Server{

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "server_id")
     private int server_id;

     @Column(name = "server_ip")
     private String serverIp;

     @Column(name = "keterangan")
     private String keterangan;

     @Column(name = "project_id")
     private int projectId;

     @Column(name = "username")
     private String username;

    public Server(String serverIp, String keterangan, int projectId, String username) {
        this.server_id = server_id;
        this.serverIp = serverIp;
        this.keterangan = keterangan;
        this.projectId = projectId;
        this.username = username;
    }

    public Server() {

    }

    public int getServer_id() {
        return server_id;
    }

    public void setServer_id(int server_id) {
        this.server_id = server_id;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
