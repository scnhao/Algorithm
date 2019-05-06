package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test1 {
	public static void main(String[] args) {
		BuyHouse b =new BuyHouseImpl();
		InvocationHandler handler = new DynamicProxyHandler(b);
		BuyHouse proxyBuyHouse =(BuyHouse)Proxy.newProxyInstance(
				handler.getClass().getClassLoader(), b.getClass().getInterfaces(), 
				handler);
		proxyBuyHouse.buyHouse();
		
	}

	
}
