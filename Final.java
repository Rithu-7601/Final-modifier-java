final class Ab{
	final void display() {
		
	}
}

//class Bc extends Ab { //cannot inherit final class
	
	//final methods cant be overriden. but final methods can be inherited.
//	void display() {
//		
//	}
//}


public class Final {
	
	final int a= 30;
	
	//constructors cannot be created using final modifier.
	//final Final(){	} //he final field Final.a cannot be assigned


	public static void main(String[] args) {
		final int n = 15;//local variable
		System.out.println(n);
		//n=26; //The final local variable n cannot be assigned.
		System.out.println(n);
		
		//instance var can be accessed by creating objects
		Final obj = new Final();
		//obj.a=38; //he final field Final.a cannot be assigned
		System.out.println(obj.a);

	}

}
