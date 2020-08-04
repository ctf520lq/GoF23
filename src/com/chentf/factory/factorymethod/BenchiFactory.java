package com.chentf.factory.factorymethod;

public class BenchiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Benchi();
	}

}
