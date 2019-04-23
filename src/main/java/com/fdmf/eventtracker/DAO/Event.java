package com.fdmf.eventtracker.DAO;

import java.util.Date;

public class Event {
    private String id;
    private String type;
    private boolean accessType;
    private Date created_at;
    private User actor;
    private Repository repo;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the accessType
     */
    public boolean isAccessType() {
        return accessType;
    }

    /**
     * @param accessType the accessType to set
     */
    public void setAccessType(boolean accessType) {
        this.accessType = accessType;
    }

    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the actor
     */
    public User getUser() {
        return actor;
    }

    /**
     * @param actor the actor to set
     */
    public void setUser(User actor) {
        this.actor = actor;
    }

    /**
     * @return the repo
     */
    public Repository getRepo() {
        return repo;
    }

    /**
     * @param repo the repo to set
     */
    public void setRepo(Repository repo) {
        this.repo = repo;
    }

    @Override
    public String toString() {
        return "Event [id=" + id + ", type=" + type + ", accessType=" + accessType + ", created_at=" + created_at
                + ", user=" + actor + ", repo=" + repo + "]";
    }


}
