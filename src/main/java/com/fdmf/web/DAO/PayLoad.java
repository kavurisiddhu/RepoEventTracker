package com.fdmf.web.DAO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown = true )
public class PayLoad {
	private String ref;
	private String ref_type;
	private String master_branch;
	private String description;
	private String pusher_type;
	private Commits[] commits;
	/**
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}
	/**
	 * @return the ref_type
	 */
	public String getRef_type() {
		return ref_type;
	}
	/**
	 * @param ref_type the ref_type to set
	 */
	public void setRef_type(String ref_type) {
		this.ref_type = ref_type;
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
	
	/**
	 * @return the commits
	 */
	public Commits[] getCommits() {
		return commits;
	}
	/**
	 * @param commits the commits to set
	 */
	public void setCommits(Commits[] commits) {
		this.commits = commits;
	}
	@Override
	public String toString() {
		return "PayLoad [ref=" + ref + ", ref_type=" + ref_type + ", master_branch=" + master_branch + ", description="
				+ description + ", pusher_type=" + pusher_type + ", commits=" + commits + "]";
	}
	
	
}
