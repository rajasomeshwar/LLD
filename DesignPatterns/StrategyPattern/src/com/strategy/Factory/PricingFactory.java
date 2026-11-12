package com.strategy.Factory;

import com.strategy.price.AirplanPricing;
import com.strategy.price.BikePricing;
import com.strategy.price.CarPricing;
import com.strategy.price.PricingStrategy;

public class PricingFactory {
	public PricingStrategy getStrategyFor(String type) {
		switch(type) {
		case "Bike" : return  new BikePricing();
		case "Car" : return  new CarPricing();
		}
		return new AirplanPricing();
	}
}
