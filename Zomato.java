class Zomato{
static double ref = 0.0;
public static double getprice(String itemName){

			if(itemName == " Butter Chicken"){
			ref = 12.0;
			return ref;
			}
			if(itemName == "Garlic Bread"){
			ref = 120.0;
			return ref;
			}
			if(itemName == " Chicken Lollipop"){
			ref = 120.0;
			return ref;
			}
			if(itemName == " Mutton Biryani"){
			ref =130.0 ;
			return ref;
			}
			if(itemName == "Palak Paneer"){
			ref = 140.0 ;
			return ref;
			}
			if(itemName == "Chicken Manchurian"){
			ref =40.0 ;
			return ref;
			}
			if(itemName == "Rajma Chawal"){
			ref = 120.0;
			return ref;
			}
			if(itemName == "Dosa"){
			ref =50.0 ;
			return ref;
			}
			if(itemName == "Idli"){
			ref =35.0 ;
			return ref;
			}
			if(itemName == "Vada Pav"){
			ref =13.0 ;
			return ref;
			}
			if(itemName == "Misal Pav"){
			ref = 150.0;
			return ref;
			}
			if(itemName == " Pani Puri"){
			ref = 45.0;
			return ref;
			}
			if(itemName == "Rava Dosa"){
			ref =45.0 ;
			return ref;
			}
			if(itemName == " Chicken 65"){
			ref = 120.0;
			return ref;
			}
			if(itemName == "Fish Fry"){
			ref = 67.0;
			return ref;
			}
			if(itemName == " Egg Curry"){
			ref = 12.0;
			return ref;
			}
			if(itemName == " Chana Masala"){
			ref = 140.0;
			return ref;
			}
			if(itemName == "Mattar Paneer"){
			ref =120.0 ;
			return ref;
			}
			if(itemName == " Gobi Manchurian"){
			ref =13.0 ;
			return ref;
			}
			if(itemName == "Jalebi"){
			ref = 13.0;
			return ref;
			}
			else{
			System.out.println(itemName + "not food");
			
			return ref;
			}



}




}