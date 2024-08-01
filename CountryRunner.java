class CountryRunner{

    public static void main(String country[]){ 
	
	    System.out.println("Main Started");
	    Country india = new Country(91,28,"Narendra Modi","1.45 billion");
		
		System.out.println("Country Details");
		System.out.println("Country Id of India is " + india.countryId);
		System.out.println("Number of States in India is " + india.noOfStates);
		System.out.println("Prime Minister in India is " + india.primeMinister);
		System.out.println("Population in India is " + india.population);
		
		Country pak = new Country(92,4,"Shehbaz Sharif","23.58 crores");
		
		System.out.println("Country Details");
		System.out.println("Country Id of Pakistan is " + pak.countryId);
		System.out.println("Number of States in Pakistan is " + pak.noOfStates);
		System.out.println("Prime Minister in Pakistan is " + pak.primeMinister);
		System.out.println("Population in Pakistan is " + pak.population);
		
		
		Country afgn = new Country(93,34,"Mullah Mohammad Hassan Akhund","43.3 million");
		
		System.out.println("Country Details");
		System.out.println("Country Id of Afghanisthan is " + afgn.countryId);
		System.out.println("Number of States in Afghanisthan is " + afgn.noOfStates);
		System.out.println("Prime Minister in Afghanisthan is " + afgn.primeMinister);
		System.out.println("Population in Afghanisthan is " + afgn.population);
		
		Country australia = new Country(61,6,"Anthony Albanese","26 million");
		
		System.out.println("Country Details");
		System.out.println("Country Id of Australia is " + australia.countryId);
		System.out.println("Number of States in Australia is " + australia.noOfStates);
		System.out.println("Prime Minister in Australia is " + australia.primeMinister);
		System.out.println("Population in Australia is " + australia.population);
		
		Country swiz = new Country(41,26,"Viola Amherd","8 million");
		
		System.out.println("Country Details");
		System.out.println("Country Id of SwitzerLand is " + swiz.countryId);
		System.out.println("Number of States in SwitzerLand is " + swiz.noOfStates);
		System.out.println("Prime Minister in SwitzerLand is " + swiz.primeMinister);
		System.out.println("Population in SwitzerLand is " + swiz.population);
		
		Country usa = new Country(1,50,"Joe Biden","341 million");
		
		System.out.println("Country Details");
		System.out.println("Country Id of United States is " + usa.countryId);
		System.out.println("Number of States in United States is " + usa.noOfStates);
		System.out.println("Prime Minister in United States is " + usa.primeMinister);
		System.out.println("Population in United States is " + usa.population);
		
		Country sriLanka = new Country(94,25,"Dinesh Gunawardena","21 million");
		
		System.out.println("Country Details");
		System.out.println("Country Id of Srilanka is " + sriLanka.countryId);
		System.out.println("Number of States in Srilanka is " + sriLanka.noOfStates);
		System.out.println("Prime Minister in Srilanka is " + sriLanka.primeMinister);
		System.out.println("Population in Srilanka is " + sriLanka.population);
		
		Country china = new Country(86,23,"Li Qiang","14 million");
		
		System.out.println("Country Details");
		System.out.println("Country Id of China is " + china.countryId);
		System.out.println("Number of States in China is " + china.noOfStates);
		System.out.println("Prime Minister in China is " + china.primeMinister);
		System.out.println("Population in China is " + china.population);
		
		
		System.out.println("Main Ended");
	}
}