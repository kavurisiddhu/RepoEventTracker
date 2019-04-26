package com.fdmf.web.DAO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;

public class EventsDetails {
	
	@JsonView(ReturnAsJson.Public.class)
	private String id;
	@JsonView(ReturnAsJson.Public.class)
	private String type;
	@JsonView(ReturnAsJson.Public.class)
    private String created_at;
	@JsonView(ReturnAsJson.Public.class)
	private String user_display_login;
	@JsonView(ReturnAsJson.Public.class)
	private String master_branch;
	@JsonView(ReturnAsJson.Public.class)
	private String description;
	@JsonView(ReturnAsJson.Public.class)
	private String pusher_type;
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
	 * @return the created_at
	 */
	public String getCreated_at() {
		return created_at;
	}
	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	/**
	 * @return the user_display_login
	 */
	public String getUser_display_login() {
		return user_display_login;
	}
	/**
	 * @param user_display_login the user_display_login to set
	 */
	public void setUser_display_login(String user_display_login) {
		this.user_display_login = user_display_login;
	}
	/**
	 * @return the master_branch
	 */
	public String getMaster_branch() {
		return master_branch;
	}
	/**
	 * @param master_branch the master_branch to set
	 */
	public void setMaster_branch(String master_branch) {
		this.master_branch = master_branch;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the pusher_type
	 */
	public String getPusher_type() {
		return pusher_type;
	}
	/**
	 * @param pusher_type the pusher_type to set
	 */
	public void setPusher_type(String pusher_type) {
		this.pusher_type = pusher_type;
	}
	@Override
	public String toString() {
		return "EventsDetails [id=" + id + ", type=" + type + ", created_at=" + created_at + ", user_display_login="
				+ user_display_login + ", master_branch=" + master_branch + ", description=" + description
				+ ", pusher_type=" + pusher_type + "]";
	}
	
	
}
