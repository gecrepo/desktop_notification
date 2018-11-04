package com.gecrepo.addon.desktopnotification.web.toolkit.ui.desktopnotificationcomponent;

import com.gecrepo.addon.desktopnotification.web.gui.Notification;
import com.vaadin.shared.ui.JavaScriptComponentState;

/**
 * Desktop notification transfer state
 *
 * @author adiatullin
 */
public class DesktopNotificationComponentState extends JavaScriptComponentState {
    private static final long serialVersionUID = -1379815637245889270L;

    public String unsupportedCaption;
    public Boolean checkAccess;
    public Notification notification;
}
