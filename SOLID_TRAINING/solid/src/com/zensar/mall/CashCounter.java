package com.zensar.mall;

public class CashCounter {

	public static void main(String[] args) {
		 ElectronicItem tv = new Television();
		int price= DiscountUtil.getDiscountedPrice(tv);
		 System.out.println(price);
		 ElectronicItem rf = new Refrigerator();
			 price= DiscountUtil.getDiscountedPrice(rf);
			 System.out.println(price);
			 
			 
			 ElectronicItem stv = new SamsungTelevision();
			 price= DiscountUtil.getDiscountedPrice(stv);
			 System.out.println(price);

	}

}
