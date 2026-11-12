package com.strategy.price;

/*
 *  Every Strategy needs to implement this 
 *  acts as base for other's 
 */
public interface PricingStrategy {
  void getPrice();
}
