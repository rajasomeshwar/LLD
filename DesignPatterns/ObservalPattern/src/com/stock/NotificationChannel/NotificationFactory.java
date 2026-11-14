package com.stock.NotificationChannel;

import static com.stock.NotificationChannel.CHANNELTYPE.*;

public class NotificationFactory {
    public static  NotificationChannel getInstance(CHANNELTYPE type, NotificationChannel parent) {
        if (type == null) return new CompositeNotification();
        if (type.equals(EMAIL)) {
            return new EmailNotification(parent);
        }
        if (type.equals(SMS))
            return new SMSNotification(parent);
        if (type.equals(MOBILE))
            return new MobileNotification(parent);
        return new CompositeNotification();

    }
}
