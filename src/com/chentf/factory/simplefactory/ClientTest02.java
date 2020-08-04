package com.chentf.factory.simplefactory;
/**
 * @ClassName:ClientTest02   
 * @Description:简单工厂测试
 * @author:陈腾飞
 * @date:2020年8月4日 下午3:13:57
 */
public class ClientTest02 {

	public static void main(String[] args) {
		Car car1 = CarFactory.createCar("奥迪");
		Car car2 = CarFactory.createCar("比亚迪");
		car1.run();
		car2.run();
		System.out.println("------------------");
		Car c1 = CarFactory2.createAudi();
		Car c2 = CarFactory2.createByd();
		c1.run();
		c2.run();
	}
}
