package polymorphism;

public class PolyChild extends PolyParent{

	public void parent(int a, int b)
	{
		super.parent(5, 8);
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		PolyChild obj=new PolyChild();
		obj.parent(20, 15);
	}

}
