class Bottle{
	String brandName;
	double price;
	
	Bottle(){
		System.out.println("Bottle object is created");
	}
	
	public Bottle(String brandName , double price){
			System.out.println("Bottle object is created");
			this.brandName = brandName;
			this.price = price;
		
	}
}