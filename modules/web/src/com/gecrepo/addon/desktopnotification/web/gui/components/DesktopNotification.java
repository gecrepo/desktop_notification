package com.gecrepo.addon.desktopnotification.web.gui.components;

import com.gecrepo.addon.desktopnotification.web.gui.Notification;
import com.haulmont.cuba.gui.components.Component;

/**
 * This UI component provide to show native notification to the user
 *
 * @author adiatullin
 */
public interface DesktopNotification extends Component {
    String NAME = "desktop-notification";

    /**
     * @return check is user permitted notification show
     */
    boolean isRequestAccess();

    /**
     * Ask if need from user access to it notification system
     */
    void requestAccess();

    /**
     * Show (if possible) notification to user
     *
     * @param notification message details
     */
    void sendNotification(Notification notification);
}