package com.stock.NotificationChannel;

import com.stock.entity.Stock;

public class CompositeNotification implements  NotificationChannel{

    @Override
    public void notifyForStockAvailable(Stock changed) {
        System.out.println("Nothing to nofitied");
    }
}
