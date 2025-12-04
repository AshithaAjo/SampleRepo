package inheritance;

public class MultipleChild implements multipleparent1,multipleparent2{
	
	public void sum()
	{
		int m=10;
		int n=40;
		int p=m+n;
		System.out.println(p); 
		
	}

	public static void main(String[] args) {
		
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.print();
		obj.sum();
	}

	@Override
	public void print() {
		int a=3;
		int b=6;
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void display() {
		System.out.println("Hello world");
		
	}

}
