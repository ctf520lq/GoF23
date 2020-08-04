package com.chentf.factory.factorymethod;

public class ClientTest01 {

	public static void main(String[] args) {
		Car car1 = new AudiFactory().createCar();
		Car car2 = new BydFactory().createCar();
		//后来加入进来奔驰车,不需要修改原有的类结构和代码
		Car car3 = new BenchiFactory().createCar();
		car1.run();
		car2.run();
		car3.run();
			
	}
}
