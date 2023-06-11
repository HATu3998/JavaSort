package com.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {9, 6, 5, 2, 3, 1, 4};
        sort(a, 0, a.length - 1);
        print(a);
    }

    public static void print(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    public static void sort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        int pivot = a[mid];
        int l = left, r = right;

        while (l <= r) {
            while (a[l] < pivot) {
                l++;
            }
            while (a[r] > pivot) {
                r--;
            }
            if (l <= r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }

        if (left > r) {
            sort(a, left, r);
        }
        if (l < right) {
            sort(a, l, right);
        }
    }
}
