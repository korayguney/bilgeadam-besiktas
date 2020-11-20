package com.bilgeadam.minmax;

public class MinMax {

	public static void main(String[] args) {

		int[] arr = { 1, 34, -3, 0, 67, 178 };

		int resultMax = findMax(arr);
		int resultMin = findMin(arr);

		System.out.println("Min : " + resultMin);
		System.out.println("Max : " + resultMax);
		
	}

	private static int findMin(int[] arr) {
		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (temp > arr[i]) {
				temp = arr[i];
			}
		}

		return temp;
	}

	private static int findMax(int[] arr) {

		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (temp < arr[i]) {
				temp = arr[i];
			}
		}

		return temp;
	}

}
