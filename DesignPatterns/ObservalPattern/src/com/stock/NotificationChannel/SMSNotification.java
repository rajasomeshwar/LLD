package com.stock.NotificationChannel;

import com.stock.entity.Stock;

public class SMSNotification implements NotificationChannel{
    NotificationChannel parent;
    public SMSNotification(NotificationChannel parent) {
        this.parent = parent;
    }
    @Override
    public void notifyForStockAvailable(Stock changed) {
        System.out.println("notification by sms "+ changed.getProductName());
        parent.notifyForStockAvailable(changed);
    }
}
