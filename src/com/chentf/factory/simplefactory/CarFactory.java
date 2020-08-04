package com.chentf.factory.simplefactory;

public class CarFactory {

	public static Car createCar(String type) {
		if("奥迪".equals(type)) {
			return new Audi();
		}
		if("比亚迪".equals(type)) {
			return new Byd();		
		}
		return null;
	}
}
