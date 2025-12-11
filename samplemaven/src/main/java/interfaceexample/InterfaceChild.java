package interfaceexample;

public class InterfaceChild implements Interface1 {

	public void display()
	{
		
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		InterfaceChild obj=new InterfaceChild();
		obj.method1();
		obj.method2();
		obj.display();
		
		//reference creation
		Interface1 obj1=new InterfaceChild();//used to get methods from interface only
		
		obj1.method1();
		obj1.method2();
		

	}

	@Override
	public void method1() {
		int a=15;
		int b=5;
		int c=a-b;
		System.out.println(c);
		
	}

	@Override
	public void method2() {
		System.out.println("Hello Interface");
		
	}

}
