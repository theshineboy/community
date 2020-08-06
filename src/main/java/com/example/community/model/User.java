package com.example.community.model;

public class User {

    private int id;
    private String account_id;
    private String account_name;
    private String token;
    private String gmt_createtime;
    private String gmt_updatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getGmt_createtime() {
        return gmt_createtime;
    }

    public void setGmt_createtime(String gmt_createtime) {
        this.gmt_createtime = gmt_createtime;
    }

    public String getGmt_updatetime() {
        return gmt_updatetime;
    }

    public void setGmt_updatetime(String gmt_updatetime) {
        this.gmt_updatetime = gmt_updatetime;
    }
}
