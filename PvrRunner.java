class PvrRunner{

public static void main(String[] movies){

System.out.println("main method started");
String name = "Kill";
double price = Pvr.getMoviePriceByName(name);
System.out.println("The price of the " +name +" is:" +price);

System.out.println("main method started");

}


}