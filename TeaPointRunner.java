class TeaPointRunner{
	
	public static void main(String[] chai){
		System.out.println("Main started");
	
		boolean teaAdded = TeaPoint.addTeaNames("Green tea");
		System.out.println("Tea name added");
		
		teaAdded = TeaPoint.addTeaNames("Ginger tea");
		System.out.println("Tea name added");
		
		teaAdded = TeaPoint.addTeaNames("Amurut tea");
		System.out.println("Tea name added");
		
		teaAdded = TeaPoint.addTeaNames("Elachi tea");
		System.out.println("Tea name added");
		
		teaAdded = TeaPoint.addTeaNames("Normal tea");
		System.out.println("Tea name added");
		
		teaAdded = TeaPoint.addTeaNames("Lemon tea");
		System.out.println("The name added");
		
		teaAdded = TeaPoint.addTeaNames(" tea");
		System.out.println("The name added");
		
		TeaPoint.readTeaNames();
		
		System.out.println("Main ended");
	}
}