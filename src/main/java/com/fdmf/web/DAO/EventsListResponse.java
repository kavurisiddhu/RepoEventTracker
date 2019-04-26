package com.fdmf.web.DAO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class EventsListResponse {
	@JsonView(ReturnAsJson.Public.class)
	public List<EventsDetails> eventDetails;

	/**
	 * @return the eventDetails
	 */
	public List<EventsDetails> getEventDetails() {
		return eventDetails;
	}

	/**
	 * @param eventDetails the eventDetails to set
	 */
	public void setEventDetails(List<EventsDetails> eventDetails) {
		this.eventDetails = eventDetails;
	}

	@Override
	public String toString() {
		return "EventsListResponse [eventDetails=" + eventDetails + "]";
	}
	
	
	
}
