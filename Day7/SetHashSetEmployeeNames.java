package com.demo.collections;
import java.util.*;
public class SetHashSetEmployeeNames {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Harry");
		set.add("Ron");
		set.add("John");
		set.add("Richard");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
