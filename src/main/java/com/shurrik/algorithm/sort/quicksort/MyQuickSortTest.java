package com.shurrik.algorithm.sort.quicksort;

public class MyQuickSortTest {

	public static void main(String[] args) {
		Integer[] arr = {4,7,3,98,22,55,66};
		for(Integer item:arr)
		{
			System.out.print(item+",");
		}
		MyQuickSort mqs = new MyQuickSort();
		mqs.quickSort(arr);
		System.out.println();
		for(Integer item:arr)
		{
			System.out.print(item+",");
		}
	}
}
