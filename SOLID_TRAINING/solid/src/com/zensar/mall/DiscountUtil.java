package com.zensar.mall;

public class DiscountUtil {
	
	public static int getDiscountedPrice(ElectronicItem item){
		return  item.getPrice() -(int) (item.getPrice() * 0.10);
	}

}
