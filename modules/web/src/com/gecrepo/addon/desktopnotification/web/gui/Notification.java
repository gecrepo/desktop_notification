package com.gecrepo.addon.desktopnotification.web.gui;

import java.io.Serializable;

/**
 * Desktop notification message
 *
 * @author adiatullin
 */
public final class Notification implements Serializable {
    private static final long serialVersionUID = 3491718403946265662L;

    private String title;
    private String content;
    private String iconLink;
    private int timeoutMs = -1;

    /**
     * @return short name of notification
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return main content of notification
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return notification icon resource path
     */
    public String getIconLink() {
        return iconLink;
    }

    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    /**
     * @return notification show lifetime
     */
    public int getTimeoutMs() {
        return timeoutMs;
    }

    public void setTimeoutMs(int timeoutMs) {
        this.timeoutMs = timeoutMs;
    }

    public boolean isEmpty() {
        return (title == null || title.length() == 0) && (content == null || content.length() == 0);
    }
}