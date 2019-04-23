package com.fdmf.eventtracker.DAO;

public class BaseRequest {
    private String eventsPerPage;

    /**
     * @return the eventsPerPage
     */
    public String getEventsPerPage() {
        return eventsPerPage;
    }

    /**
     * @param eventsPerPage the eventsPerPage to set
     */
    public void setEventsPerPage(String eventsPerPage) {
        this.eventsPerPage = eventsPerPage;
    }

}
