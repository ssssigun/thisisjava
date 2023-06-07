package ch06.example;

public class ShopService {
	
	private static ShopService instance = new ShopService();
	
	private ShopService(){}
	
	public static ShopService getInstance() {
		if(instance ==null) instance = new ShopService();
		return instance;
		
	}
}
