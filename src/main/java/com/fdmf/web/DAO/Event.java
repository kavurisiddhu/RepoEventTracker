package com.fdmf.web.DAO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Event {
	
    private String id;
    private String type;
    private boolean accessType;
    private Date created_at;
    private Repository repo;
    private PayLoad payload;

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
    
    
    /**
	 * @return the payload
	 */
	public PayLoad getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(PayLoad payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", type=" + type + ", accessType=" + accessType + ", created_at=" + created_at+
				 ", repo=" + repo + ", payload=" + payload + "]";
	}


}
