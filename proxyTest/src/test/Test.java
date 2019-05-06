package test;

public class Test {
	public static void main(String[] args) {
		BuyHouse b = new BuyHouseImpl();
		BuyHouseProxy p = new BuyHouseProxy(b);
		p.buyHouse();
	}
}
