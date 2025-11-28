package inheritance;

public class Hchild2 extends Hparent {

	public void division()
	{
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}
	
	public static void sum()
	{
		int a=7;
		int b=9;
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hchild2 obj=new Hchild2();
obj.show();
obj.division();
Hchild2.sum();

	}

}
