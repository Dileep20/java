class BottleRunner{
	public static void main(String[] wb){
		
		Bottle ref = new Bottle();
		ref.brandName = "Tupper ware";
		ref.price = 120.00;
		
		System.out.println("Brand of the bottle is "+ref.brandName);
		System.out.println("Price os the bottle is "+ref.price);
		
		Bottle ref1 = new Bottle();
		ref1.brandName = "cello";
		ref1.price = 110.00;
		
		System.out.println("Brand of the bottle is "+ref1.brandName);
		System.out.println("Price os the bottle is "+ref1.price);
		
		Bottle ref2 = new Bottle("Tupper ware" , 120.00);
			System.out.println("Brand of the bottle is "+ref2.brandName);
			System.out.println("Price os the bottle is "+ref2.price);
			
		Bottle ref3 = new Bottle("Cello" , 110.00);
			System.out.println("Brand of the bottle is "+ref3.brandName);
			System.out.println("Price os the bottle is "+ref3.price);
	}
}