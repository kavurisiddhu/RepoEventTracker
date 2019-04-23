package com.fdmf.eventtracker.DAO;

public class GetEventsListReq extends BaseRequest {
    private String user;
    private String repo;
    private String eventName;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the repo
     */
    public String getRepo() {
        return repo;
    }

    /**
     * @param repo the repo to set
     */
    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "GetEventsListReq [user=" + user + ", repo=" + repo + ", eventName=" + eventName + "]";
    }


}
