package com.sort;

public class InsertSort {

	public static void main(String[] args) {
		int[] a= {9,6,5,2,3,1,4};
		Sort(a);
	}
	public static void print(int[] a) {
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
	public static void Sort(int[]a) {
		for(int i=1;i<a.length;i++) {
			int ai=a[i];
			int j=i-1;
			while(j>=0 && a[j]>ai ) {
				a[j+1]=a[j];j--;
			}
			a[j+1]=ai;
			print(a);
			System.out.println();
		}
	}
}
