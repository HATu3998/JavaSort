package com.sort;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,6,5,2,3,1,4};
		Sort(a);
	}
	public static void print(int[] a) {
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

	public static void Sort(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			print(a);
			System.out.println();
		}
	}

}