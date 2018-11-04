package com.gecrepo.addon.desktopnotification.web.toolkit.ui.desktopnotificationcomponent;

import com.gecrepo.addon.desktopnotification.web.gui.Notification;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.annotations.JavaScript;

/**
 * Desktop notification js bridge component
 *
 * @author adiatullin
 */
@JavaScript({"desktopnotificationcomponent-connector.js"})
public class DesktopNotificationComponent extends AbstractJavaScriptComponent {
    private static final long serialVersionUID = -1977681391076466528L;

    private Boolean access;

    public DesktopNotificationComponent() {
        addFunction("notificationAccess", arguments -> {
            access = arguments.getBoolean(0);
            getState().checkAccess = Boolean.FALSE;
        });
    }

    @Override
    protected DesktopNotificationComponentState getState() {
        return (DesktopNotificationComponentState) super.getState();
    }

    public void setUnsupportableBrowserCaption(String caption) {
        getState().unsupportedCaption = caption;
    }

    public boolean isRequestAccess() {
        return Boolean.TRUE.equals(access);
    }

    public void requestAccess() {
        getState().checkAccess = Boolean.TRUE;
    }

    public void sendNotification(Notification notification) {
        getState().notification = notification;
    }
}