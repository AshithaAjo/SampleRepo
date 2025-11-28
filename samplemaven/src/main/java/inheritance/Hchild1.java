package inheritance;

public class Hchild1 extends Hparent {
public void sum()
{
	int a=5;
	int b=10;
	int c=b-a;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hchild1 obj=new Hchild1();
obj.show();
obj.sum();
	}

}
