package com.modor.proxy;

public class Proxy {

	private HidedObject hidedObject = new HidedObject();

	public String operation() {
		return hidedObject.operation();
	}
}
