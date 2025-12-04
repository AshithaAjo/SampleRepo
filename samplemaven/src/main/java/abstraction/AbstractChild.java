package abstraction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.print();
	}

	@Override
	public void display() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void print() {
		System.out.println("Hello Java");
		
	}

}
