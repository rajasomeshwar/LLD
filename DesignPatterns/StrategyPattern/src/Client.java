/* 
 *  This class about create strategy pattern 
 * 
 */

import com.strategy.Factory.PricingFactory;

public class Client {
  public static void main(String ...strings) {
	  PricingFactory factory = new PricingFactory();
	  factory.getStrategyFor("Bike").getPrice();
  }
}
