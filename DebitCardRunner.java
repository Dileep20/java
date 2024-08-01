class DebitCardRunner{

    public static void main(String debit[]){
	
	    System.out.println("Main Started");
	    DebitCard card = new DebitCard(1,"Shashank",7458564125237458L,"21/05/2028",854);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card.cardId);
		System.out.println("Debit Card Holder Name is " + card.cardHolderName);
		System.out.println("Debit Card Number is " + card.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card.expDate);
		System.out.println("Debit Card Verification Value is " + card.cvv);
		
		DebitCard card1 = new DebitCard(2,"Arun",5258709433211345L,"22/06/2029",524);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card1.cardId);
		System.out.println("Debit Card Holder Name is " + card1.cardHolderName);
		System.out.println("Debit Card Number is " + card1.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card1.expDate);
		System.out.println("Debit Card Verification Value is " + card1.cvv);
		
		DebitCard card2 = new DebitCard(3,"Bharath",8527234509876548L,"27/12/2027",654);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card2.cardId);
		System.out.println("Debit Card Holder Name is " + card2.cardHolderName);
		System.out.println("Debit Card Number is " + card2.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card2.expDate);
		System.out.println("Debit Card Verification Value is " + card2.cvv);
		
		DebitCard card3 = new DebitCard(4,"Dileep",5552707518636096L,"08/07/2025",525);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card3.cardId);
		System.out.println("Debit Card Holder Name is " + card3.cardHolderName);
		System.out.println("Debit Card Number is " + card3.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card3.expDate);
		System.out.println("Debit Card Verification Value is " + card3.cvv);
		
		DebitCard card4 = new DebitCard(5,"Sharath",9860961244996428L,"27/06/2023",456);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card4.cardId);
		System.out.println("Debit Card Holder Name is " + card4.cardHolderName);
		System.out.println("Debit Card Number is " + card4.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card4.expDate);
		System.out.println("Debit Card Verification Value is " + card4.cvv);
		
		DebitCard card5 = new DebitCard(6,"Manasa",5874285658546289L,"17/12/2027",741);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card5.cardId);
		System.out.println("Debit Card Holder Name is " + card5.cardHolderName);
		System.out.println("Debit Card Number is " + card5.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card5.expDate);
		System.out.println("Debit Card Verification Value is " + card5.cvv);
		
		DebitCard card6 = new DebitCard(7,"Adhitya",6867321890765434L,"07/07/2027",777);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card6.cardId);
		System.out.println("Debit Card Holder Name is " + card6.cardHolderName);
		System.out.println("Debit Card Number is " + card6.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card6.expDate);
		System.out.println("Debit Card Verification Value is " + card6.cvv);
		
		DebitCard card7 = new DebitCard(8,"Sai Kumar",6478876521225439L,"08/07/2028",654);
		
		System.out.println("Debit Card Details");
		System.out.println("Debit Card Id is " + card7.cardId);
		System.out.println("Debit Card Holder Name is " + card7.cardHolderName);
		System.out.println("Debit Card Number is " + card7.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card7.expDate);
		System.out.println("Debit Card Verification Value is " + card7.cvv);
		
		System.out.println("Main Ended");
	}
}