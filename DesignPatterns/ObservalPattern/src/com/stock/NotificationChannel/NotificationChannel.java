package com.stock.NotificationChannel;

import com.stock.entity.Stock;

public interface NotificationChannel {
    void notifyForStockAvailable(Stock changed);
}
