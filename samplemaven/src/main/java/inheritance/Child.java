package inheritance;

public class Child extends Parent{
	
	public void print()
	{
		System.out.println("Hello from child");
	}

	public static void main(String[] args) {
		
Child obj=new Child();
obj.show();
obj.display();
obj.print();
	}

}
