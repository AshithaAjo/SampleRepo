package accessmodifiers;

public class Access2 {
//To check whether instance method in the access1 class can access to another class within the same package.
	public static void main(String[] args) {
		Access1 obj=new Access1();
		obj.display();
		obj.display2();
		obj.display3();

	}

}
