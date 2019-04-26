package com.fdmf.web.services;

import com.fdmf.web.DAO.GetEventsListReq;
import com.fdmf.web.DAO.ListEvents;

public interface GetEventService {
	
	public ListEvents getEventList(GetEventsListReq getEventsListReq);
	
}
