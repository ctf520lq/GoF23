package com.chentf.factory.simplefactory;
/**
 * @ClassName:ClientTest01   
 * @Description:测试在没有工厂模式的情况下
 * @author:陈腾飞
 * @date:2020年8月4日 下午3:10:27
 */
public class ClientTest01 {

	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		c1.run();
		c2.run();
	}
}
