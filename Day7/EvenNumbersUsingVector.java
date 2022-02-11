package com.demo.collections;
import java.util.*;
public class EvenNumbersUsingVector {
private Vector<Integer> list = new Vector<Integer>();
	
	public Vector<Integer> saveEvenNumbers(int N) {
		list = new Vector<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public Vector<Integer> printEvenNumbers() {
		Vector<Integer> newList = new Vector<Integer>();
		
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}
	public int printEvenNumber(int n)
	{
	    for(int i=0;i<list.size();i++)
	    if(list.get(i)==n)
	    return n;
	    return 0;
	}

	public static void main(String[] args) {
		EvenNumbersUsingVector asg = new EvenNumbersUsingVector();
		asg.saveEvenNumbers(10);
		asg.printEvenNumbers();
		System.out.println(asg.printEvenNumber(5));

	}
}
