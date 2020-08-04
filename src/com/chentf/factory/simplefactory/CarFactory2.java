package com.chentf.factory.simplefactory;
/**
 * @ClassName:CarFactory2   
 * @Description:简单工厂类
 * @author:陈腾飞
 * @date:2020年8月4日 下午3:11:33
 */
public class CarFactory2 {

	public static Car createAudi() {
		return new Audi();
	}
	
	public static Car createByd() {
		return new Byd();
	}
}
