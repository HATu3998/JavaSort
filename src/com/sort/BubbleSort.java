package com.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {9,6,5,2,3,1};
bubb(a);
	}
	
	public static void bubb(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			print(a);
			System.out.println();
		}
		
	}
	
	public static void print(int[] a) {
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
