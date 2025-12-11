package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List a=new ArrayList();
		a.add("Peach");
		a.add("Violet");
		a.add("white");
		System.out.println(a);
		System.out.println(a.get(2));
		a.set(1, "Blue");
		System.out.println(a);
		System.out.println(a.indexOf("Peach"));
		System.out.println(a.lastIndexOf("Blue"));
		a.remove("White");
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.contains("Red"));
		System.out.println(a.size());

	}

}
