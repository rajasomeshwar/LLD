package com.stock.User;

import com.stock.NotificationChannel.*;
import com.stock.entity.Activity;
import com.stock.entity.Stock;
import com.stock.entity.StockPublisher;

import javax.management.Notification;
import java.util.Arrays;
import java.util.HashMap;

public class User implements Activity {

    String name;
    HashMap<Stock, NotificationChannel> stockNotificationChannel;

    public User(String name) {
        this.name = name;
        stockNotificationChannel = new HashMap<>();
    }
    public void sendNotificationForThis(Stock stock, CHANNELTYPE[] typesNotification, StockPublisher publisher) {
        NotificationChannel parent = NotificationFactory.getInstance(null, null);
        for (var type : typesNotification) {
            parent = NotificationFactory.getInstance(type, parent);
        }
       stockNotificationChannel.put(stock,parent);
       publisher.subscribe(this);
    }
    @Override
    public void change(Stock changedStock) {
        stockNotificationChannel.get(changedStock).notifyForStockAvailable(changedStock);
    }
}
