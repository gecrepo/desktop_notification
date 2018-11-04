/**
* Browser notification js component
*
* @author adiatullin
**/
com_gecrepo_addon_desktopnotification_web_toolkit_ui_desktopnotificationcomponent_DesktopNotificationComponent = function() {
    var connector = this;
    var lastMessage = null;
    var notificationsEnabled = false;

    function initNotifications(unsupportedCaption) {
        if (window.Notification) {
            Notification.requestPermission(function(permission) {
                if (permission === 'granted') {
                    notificationsEnabled = true;
                }
                connector.notificationAccess(notificationsEnabled);
            });
        } else {
            connector.notificationAccess(notificationsEnabled);
            alert(unsupportedCaption);
        }
    };
    function showNotification(message) {
        if (notificationsEnabled) {

            var notification = new Notification(message.title, {
                body : message.content,
                dir: 'auto',
                icon : message.iconLink
            });

            if (message.timeoutMs > 0) {
                setTimeout(function() { notification.close(); }, message.timeoutMs);
            }
        }
    };

    connector.onStateChange = function () {
         if (connector.getState().checkAccess) {
            initNotifications(connector.getState().unsupportedCaption);
         }
         if (lastMessage != connector.getState().notification) {
            lastMessage = connector.getState().notification;

            showNotification(lastMessage);
         }
    };
}