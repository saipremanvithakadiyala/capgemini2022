package com.demo.collections;

import java.util.*;

public class EvenNumbersUsingLinkedList {
private LinkedList<Integer> list = new LinkedList<Integer>();
	
	public LinkedList<Integer> saveEvenNumbers(int N) {
		list = new LinkedList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public LinkedList<Integer> printEvenNumbers() {
		LinkedList<Integer> newList = new LinkedList<Integer>();
		
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
		EvenNumbersUsingLinkedList asg = new EvenNumbersUsingLinkedList();
		asg.saveEvenNumbers(10);
		asg.printEvenNumbers();
		System.out.println(asg.printEvenNumber(5));

	}

}
