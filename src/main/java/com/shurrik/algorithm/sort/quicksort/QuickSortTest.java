package com.shurrik.algorithm.sort.quicksort;

public class QuickSortTest {

	public static void main(String[] args) {
//		Integer[] nums = {4,2,1,3,4,5,57,92,10,34};
		Integer[] nums = {44,11,88,34,22,-1,45,-6};

		System.out.println("排序前:");
		for(Integer item:nums)
		{
			System.out.print(item+",");
		}
		
		QuickSort qs = new QuickSort();
		qs.quick(nums);
		System.out.println();
		System.out.println("排序后:");
		for(Integer item:nums)
		{
			System.out.print(item+",");
		}
		
	}
}
