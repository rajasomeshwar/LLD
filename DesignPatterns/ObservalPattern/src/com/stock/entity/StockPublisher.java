package com.stock.entity;

import java.util.ArrayList;
import java.util.List;

public class StockPublisher {

    List<Activity> activities;

    public StockPublisher() {
        activities = new ArrayList<>();
    }
    public boolean subscribe(Activity activity) {
       return this.activities.add(activity);
    }
    public boolean unSubscribe(Activity activity) {
        return this.activities.remove(activity);
    }
    public void notify(Stock stock) {
        for (Activity activity : activities) {
            activity.change(stock);
        }
    }
}
