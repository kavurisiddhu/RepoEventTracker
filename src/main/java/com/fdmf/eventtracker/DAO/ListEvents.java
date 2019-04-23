package com.fdmf.eventtracker.DAO;

import java.util.List;

public class ListEvents extends BaseResponse {
    public List<Event> eventsLst;

    /**
     * @return the eventsLst
     */
    public List<Event> getEventsLst() {
        return eventsLst;
    }

    /**
     * @param eventsLst the eventsLst to set
     */
    public void setEventsLst(List<Event> eventsLst) {
        this.eventsLst = eventsLst;
    }

    @Override
    public String toString() {
        return "ListEvents [eventsLst=" + eventsLst + "]";
    }

}
