package com.fdmf.web.DAO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown = true )
public class User {
	
    private String id;
    private String login;
    private String display_login;
    private String gravatar_id;
    private String url;
    private String avatar_url;

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
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the display_login
     */
    public String getDisplay_login() {
        return display_login;
    }

    /**
     * @param display_login the display_login to set
     */
    public void setDisplay_login(String display_login) {
        this.display_login = display_login;
    }

    /**
     * @return the gravatar_id
     */
    public String getGravatar_id() {
        return gravatar_id;
    }

    /**
     * @param gravatar_id the gravatar_id to set
     */
    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the avatar_url
     */
    public String getAvatar_url() {
        return avatar_url;
    }

    /**
     * @param avatar_url the avatar_url to set
     */
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", login=" + login + ", display_login=" + display_login + ", gravatar_id="
                + gravatar_id + ", url=" + url + ", avatar_url=" + avatar_url + "]";
    }


}
