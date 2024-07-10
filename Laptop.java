class Laptop{

	static boolean isLaptopOn = false ;
	static int maxVolume = 6;
	static int minVolume = 0;
	static int currentVolume;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isLaptopOn == false){
			isLaptopOn = true;
	
		}else if(isLaptopOn == true){
			isLaptopOn = false;
		
		}
		System.out.println("End of turnOn method");
	return isLaptopOn;
	}
	public static void increaseVolume(){
		
		System.out.println("Start of increase volume method");
	
			if(isLaptopOn == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1;
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the laptop");

		System.out.println("End of increase volume method");
	return;
	}
	
	public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isLaptopOn == true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the laptop");

		System.out.println("End of decrease volume method");
	return;
	}
	
}	