package io.modor.patterns.chain;

public class ConcreteHandler1 extends Handler {

	@Override
	public String doHandler() {
		// TODO Auto-generated method stub
		if (getNextHandler() != null) {

			getNextHandler().doHandler();
			return getNextHandler().doHandler();
		} else {

			return "handler1";
		}
	}

}
