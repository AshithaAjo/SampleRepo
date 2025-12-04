package interfaceexample;

public class InterfaceChild implements Interface1 {

	public static void main(String[] args) {
		InterfaceChild obj=new InterfaceChild();
		obj.method1();
		obj.method2();
				

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
