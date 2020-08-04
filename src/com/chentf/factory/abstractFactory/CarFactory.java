package com.chentf.factory.abstractFactory;

public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
