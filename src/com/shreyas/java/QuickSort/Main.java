package com.shreyas.java.QuickSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer>arr = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter numbers one by one,enter 0 to stop");
		int n = in.nextInt();
		while(n!=0) {
			arr.add(n);
			n = in.nextInt();
		}
		quickSort(0, arr.size()-1);
		System.out.println(arr);
	}
	public static void quickSort(int lo , int hi) {
	
		if(lo<hi) {
			
			int p = partition( lo, hi);
			
			//recursions
			quickSort( lo, p);
			quickSort( p+1, hi);
		}
		
	}
	public static int partition( int lo,int hi) {
		
		int mid = (int)(lo+hi)/2;
		if(arr.get(lo)>arr.get(mid))
		{
			int a = arr.get(lo);
			arr.set(lo, arr.get(mid));
			arr.set(mid, a);
		}
		if(arr.get(mid)>arr.get(hi))
		{
			int a = arr.get(mid);
			arr.set(mid, arr.get(hi));
			arr.set(hi, a);
		}
		if(arr.get(lo)>arr.get(mid))
		{
			int a = arr.get(lo);
			arr.set(lo, arr.get(mid));
			arr.set(mid, a);
		}
		int pivot = arr.get(mid);
		int i = lo;
		int j = hi;
		while(true) {
			while(arr.get(i)<pivot) {
				i++;
			}
			while(arr.get(j)>pivot) {
				j--;
			}
			if(i>=j) {
				return j;
			}
			int a = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, a);
			i++;
			j--;
		}
		
			
	}

}
