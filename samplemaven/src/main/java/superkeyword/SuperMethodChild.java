package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	public void child()
	{
		System.out.println("From the child class");
		super.parent();
	}

	public static void main(String[] args) {
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.child();
		
	}

}
