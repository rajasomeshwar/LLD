package com.stock.NotificationChannel;

import com.stock.entity.Stock;

public class EmailNotification implements NotificationChannel{
    NotificationChannel parent;
    public EmailNotification(NotificationChannel parent) {
        this.parent = parent;
    }
    @Override
    public void notifyForStockAvailable(Stock changed) {
        System.out.println(" nofityed by mail "+ changed.getProductName());
        parent.notifyForStockAvailable(changed);
    }
}
