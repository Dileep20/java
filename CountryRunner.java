class CountryRunner{

    public static void main(String country[]){ 
	
	    System.out.println("Main Started");
	    Country india = new Country();
		india.countryId = 91;
		india.noOfStates = 28;
		india.primeMinister = "Narendra Modi";
		india.population = "1.45 billion";
		System.out.println("Country Details");
		System.out.println("Country Id of India is " + india.countryId);
		System.out.println("Number of States in India is " + india.noOfStates);
		System.out.println("Prime Minister in India is " + india.primeMinister);
		System.out.println("Population in India is " + india.population);
		
		Country pak = new Country();
		pak.countryId = 92;
		pak.noOfStates = 4;
		pak.primeMinister = "Shehbaz Sharif";
		pak.population = "23.58 crores";
		System.out.println("Country Details");
		System.out.println("Country Id of Pakistan is " + pak.countryId);
		System.out.println("Number of States in Pakistan is " + pak.noOfStates);
		System.out.println("Prime Minister in Pakistan is " + pak.primeMinister);
		System.out.println("Population in Pakistan is " + pak.population);
		
		
		Country afgn = new Country();
		afgn.countryId = 93;
		afgn.noOfStates = 34;
		afgn.primeMinister = "Mullah Mohammad Hassan Akhund";
		afgn.population = "43.3 million";
		System.out.println("Country Details");
		System.out.println("Country Id of Afghanisthan is " + afgn.countryId);
		System.out.println("Number of States in Afghanisthan is " + afgn.noOfStates);
		System.out.println("Prime Minister in Afghanisthan is " + afgn.primeMinister);
		System.out.println("Population in Afghanisthan is " + afgn.population);
		
		Country australia = new Country();
		australia.countryId = 61;
		australia.noOfStates = 6;
		australia.primeMinister = "Anthony Albanese";
		australia.population = "26 million";
		System.out.println("Country Details");
		System.out.println("Country Id of Australia is " + australia.countryId);
		System.out.println("Number of States in Australia is " + australia.noOfStates);
		System.out.println("Prime Minister in Australia is " + australia.primeMinister);
		System.out.println("Population in Australia is " + australia.population);
		
		Country swiz = new Country();
		swiz.countryId = 41;
		swiz.noOfStates = 26;
		swiz.primeMinister = "Viola Amherd";
		swiz.population = "8 million";
		System.out.println("Country Details");
		System.out.println("Country Id of SwitzerLand is " + swiz.countryId);
		System.out.println("Number of States in SwitzerLand is " + swiz.noOfStates);
		System.out.println("Prime Minister in SwitzerLand is " + swiz.primeMinister);
		System.out.println("Population in SwitzerLand is " + swiz.population);
		
		Country usa = new Country();
		usa.countryId = 1;
		usa.noOfStates = 50;
		usa.primeMinister = "Joe Biden";
		usa.population = "341 million";
		System.out.println("Country Details");
		System.out.println("Country Id of United States is " + usa.countryId);
		System.out.println("Number of States in United States is " + usa.noOfStates);
		System.out.println("Prime Minister in United States is " + usa.primeMinister);
		System.out.println("Population in United States is " + usa.population);
		
		Country sriLanka = new Country();
		sriLanka.countryId = 94;
		sriLanka.noOfStates = 25;
		sriLanka.primeMinister = "Dinesh Gunawardena";
		sriLanka.population = "21 million";
		System.out.println("Country Details");
		System.out.println("Country Id of Srilanka is " + sriLanka.countryId);
		System.out.println("Number of States in Srilanka is " + sriLanka.noOfStates);
		System.out.println("Prime Minister in Srilanka is " + sriLanka.primeMinister);
		System.out.println("Population in Srilanka is " + sriLanka.population);
		
		Country china = new Country();
		china.countryId = 86;
		china.noOfStates = 23;
		china.primeMinister = "Li Qiang";
		china.population = "14 million";
		System.out.println("Country Details");
		System.out.println("Country Id of China is " + china.countryId);
		System.out.println("Number of States in China is " + china.noOfStates);
		System.out.println("Prime Minister in China is " + china.primeMinister);
		System.out.println("Population in China is " + china.population);
		
		
		System.out.println("Main Ended");
	}
}