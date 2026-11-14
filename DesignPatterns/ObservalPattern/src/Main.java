import com.stock.NotificationChannel.CHANNELTYPE;
import com.stock.User.User;
import com.stock.entity.Stock;
import com.stock.entity.StockPublisher;

import static com.stock.NotificationChannel.CHANNELTYPE.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockPublisher publisher = new StockPublisher();
        Stock stock = new Stock("iphone", 1, publisher);
        User user = new User("GeminiAI");
        System.out.println("testing User");
        user.sendNotificationForThis(stock, new CHANNELTYPE[]{SMS,MOBILE, EMAIL}, publisher);
        stock.setQuantity(-1);
        stock.setQuantity(3);
    }
}