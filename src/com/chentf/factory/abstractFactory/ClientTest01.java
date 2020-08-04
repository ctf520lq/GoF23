package com.chentf.factory.abstractFactory;

public class ClientTest01 {

	public static void main(String[] args) {
		CarFactory  factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
		
		CarFactory f1 = new LowCarFactory();
		Seat seat = f1.createSeat();
		seat.massage();
		CarFactory f2 = new LuxuryCarFactory();
		Tyre tyre = f2.createTyre();
		tyre.revolve();
	}
	
}
