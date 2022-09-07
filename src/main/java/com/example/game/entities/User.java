package com.example.game.entities;

import static java.util.Objects.isNull;

public class User {

    private String username;
    private Integer count;
    private String ip;

    public User(String username, Integer count, String ip) {
        if (isNull(username)) {
            throw new IllegalArgumentException("Name cannot be null.");
        } else if (username.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be negative.");
        }
        if (isNull(ip)) {
            throw new IllegalArgumentException("IP cannot be null.");
        } else if (ip.isBlank()) {
            throw new IllegalArgumentException("IP cannot be blank.");
        }
        this.username = username;
        this.count = count;
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }



    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}