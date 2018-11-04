package com.gecrepo.addon.desktopnotification.web.gui.xml.layout.loaders;

import com.gecrepo.addon.desktopnotification.web.gui.components.DesktopNotification;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;

/**
 * Desktop notification UI component loader
 *
 * @author adiatullin
 */
public class DesktopNotificationLoader extends AbstractComponentLoader<DesktopNotification> {
    @Override
    public void createComponent() {
        resultComponent = factory.createComponent(DesktopNotification.class);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {
    }
}
