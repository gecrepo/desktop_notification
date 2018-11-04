package com.gecrepo.addon.desktopnotification.web.gui.components;

import com.gecrepo.addon.desktopnotification.web.gui.Notification;
import com.gecrepo.addon.desktopnotification.web.toolkit.ui.desktopnotificationcomponent.DesktopNotificationComponent;
import com.haulmont.bali.util.Preconditions;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.web.gui.components.WebAbstractComponent;

/**
 * Vaadin desktop notification component wrapper
 *
 * @author adiatullin
 */
public class WebDesktopNotification extends WebAbstractComponent<DesktopNotificationComponent> implements DesktopNotification {

    public WebDesktopNotification() {
        this.component = new DesktopNotificationComponent();

        setCaptions(component);
    }

    protected void setCaptions(DesktopNotificationComponent component) {
        Messages messages = AppBeans.get(Messages.NAME);

        component.setUnsupportableBrowserCaption(messages.getMainMessage("desktopNotification.unsupportableBrowser"));
    }

    @Override
    public boolean isRequestAccess() {
        return component.isRequestAccess();
    }

    @Override
    public void requestAccess() {
        component.requestAccess();
    }

    @Override
    public void sendNotification(Notification notification) {
        Preconditions.checkNotNullArgument(notification);
        if (!notification.isEmpty()) {
            component.sendNotification(notification);
        }
    }
}