class LaptopRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean running = Laptop.onOrOff();
		System.out.println("is Laptop on : "+running);
	
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		
		running =Laptop.onOrOff();
		System.out.println("is Laptop on : "+running);
		
		Laptop.increaseVolume();
		
		Laptop.decreaseVolume();
		
		System.out.println("End of main method");
	}
}