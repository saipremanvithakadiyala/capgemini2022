package com.demo.collections;
import java.util.*;


class Country {
	TreeSet<String> H1 = new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}
public class InstanceVariableUsingTreeSet {
	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Korea");
		countries.saveCountryNames("China");

		System.out.println("Korea: " + countries.getCountry("Korea"));
		System.out.println("Japan: " + countries.getCountry("Japan"));
	}
}
