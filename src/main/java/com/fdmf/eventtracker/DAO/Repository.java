package com.fdmf.eventtracker.DAO;

public class Repository {
    private String id;
    private String url;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Respository [id=" + id + ", url=" + url + ", name=" + name + "]";
    }


}
