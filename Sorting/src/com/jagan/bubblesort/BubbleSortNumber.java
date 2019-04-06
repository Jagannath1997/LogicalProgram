package com.jagan.bubblesort;

public class BubbleSortNumber {
	public static void main(String[] args) {
		int[] a = { 10, 5, 2, 9, 82, 65, 120, 875 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
