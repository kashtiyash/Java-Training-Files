package com.assignments;

class Medicine{
	String medName;
	String address;
	
	 void displayLabel(String med, String add) {
		System.out.println("Medicine Name : "+ med);
		System.out.println("Address : "+ add);
	};
}

class Tablet extends Medicine{
	void displayLabel(String med, String add) {
		super.displayLabel(med, add);
		System.out.println("Store in cold and dry place");
		System.out.println("----------------------------------------");
	}
	
}
class Syrup extends Medicine{
	void displayLabel(String med, String add) {
		super.displayLabel(med, add);
		System.out.println("For External Use only");
		System.out.println("----------------------------------------");
		
	}
	
}
class Oinment extends Medicine{
	void displayLabel(String med, String add) {
		super.displayLabel(med, add);
		System.out.println("For External Use only and Store in cool and dry envirnoment");
		System.out.println("----------------------------------------");
		
	}
	
}
public class TextMedicine {
	public static void main(String[] args) {
		Medicine med;
		med = new Tablet();
		med.displayLabel("Med Tablet","Pune");
		med = new Oinment();
		med.displayLabel("Med Oinment","Mumbai");
		med = new Syrup();
		med.displayLabel("Med Syrup","Nagpur");
		
		
	}

}
