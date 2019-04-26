package com.fdmf.web.DAO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Commits {
	private String sha;
	private String message;
	private Author author;
	/**
	 * @return the sha
	 */
	public String getSha() {
		return sha;
	}
	/**
	 * @param sha the sha to set
	 */
	public void setSha(String sha) {
		this.sha = sha;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Commits [sha=" + sha + ", message=" + message + ", author=" + author + "]";
	}
	
}
