package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> a= new HashSet<String>();
		a.add("Apple");
		a.add("Banana");
		a.add("Orange");
		
		Set<String> b = new HashSet<String>();
		b.add("Watermelon");
		b.add("Grape");
		
		System.out.println(a);
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.contains("Banana"));
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		System.out.println(a.isEmpty());
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(b.size());
		b.clear();
		System.out.println(b);

	}

}
