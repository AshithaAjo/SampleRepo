package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("Blue");
		a.add("Red");
		a.add("Green");
		a.add("Blue");
		System.out.println(a);
		System.out.println(a.get(2));
		a.set(1, "Black");
		System.out.println(a);
		
		System.out.println(a.indexOf("Green"));
		
		System.out.println(a.lastIndexOf("Blue"));
		System.out.println(a.remove(0));
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.contains("Red"));
		System.out.println(a.size());

	}

}
