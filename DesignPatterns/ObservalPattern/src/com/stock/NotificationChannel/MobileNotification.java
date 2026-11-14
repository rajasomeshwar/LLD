package com.stock.NotificationChannel;

import com.stock.entity.Stock;

public class MobileNotification implements NotificationChannel{
    NotificationChannel parent;
    public MobileNotification(NotificationChannel parent) {
        this.parent = parent;
    }
    @Override
    public void notifyForStockAvailable(Stock changed) {
        System.out.println("notification by mobile "+ changed.getProductName());
        parent.notifyForStockAvailable(changed);
    }
}
