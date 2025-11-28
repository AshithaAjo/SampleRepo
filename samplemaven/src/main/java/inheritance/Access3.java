package inheritance;

import accessmodifiers.Access1;
//To check whether can we access instance method from another class from another package
public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 obj=new Access1();
		obj.display();
		Access3 obj1=new Access3();
		obj1.display2();

	}

}
//without extends we get only public method 
//To get protected we should extend/create subclass and create object for the current class