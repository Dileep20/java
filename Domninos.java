class Domninos{
static double ref = 0.0;
public static double getprice(String itemName){

			if(itemName == "Pizza"){
			ref = 100.0;
			return ref;
			}
			if(itemName == "Burgers"){
			ref =150.0 ;
			return ref;
			}
			if(itemName == "Tacos"){
			ref = 80.0;
			return ref;
			}
			if(itemName == "Sushi"){
			ref =90.0 ;
			return ref;
			}
			if(itemName == " Dumplings"){
			ref = 120.0;
			return ref;
			}
			if(itemName == "Samosas"){
			ref = 130.0;
			return ref;
			}
			if(itemName == "Quesadillas"){
			ref =200.0 ;
			return ref;
			}
			if(itemName == "Naan Pizza"){
			ref =170.0 ;
			return ref;
			}
			if(itemName == "Momos"){
			ref = 18.0;
			return ref;
			}
			if(itemName == "Shawarma"){
			ref =120.0 ;
			return ref;
			}
			if(itemName == "Arepas"){
			ref = 142.0 ;
			return ref;
			}
			if(itemName == " Empanadas"){
			ref = 50.0 ;
			return ref;
			}
			if(itemName == " Crepes"){
			ref = 120.0;
			return ref;
			}
			if(itemName == "Waffles"){
			ref = 240.0 ;
			return ref;
			}
			if(itemName == "ish Tacos"){
			ref =120.0 ;
			return ref;
			}
			if(itemName == "Veggie Burgers"){
			ref =45.0 ;
			return ref;
			}
			if(itemName == "Mac and Cheese"){
			ref = 40.0;
			return ref;
			}
			if(itemName == "Mac and Cheese"){
			ref = 50.6;
			return ref;
			}
			if(itemName == "Beef Noodles"){
			ref = 30.0 ;
			return ref;
			}
			if(itemName == "Vegetable Curry"){
			ref = 140.0;
			return ref;
			}
			else{
			System.out.println(itemName + " not food");
			
			return ref;
			}
}
}