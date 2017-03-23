package com.shurrik.algorithm.sort.quicksort;

public class MyQuickSort {

	public void quickSort(Integer[] arr)
	{
		quickSort(arr,0,arr.length-1);
	}
	
	public int getMid(Integer[] arr,int low,int high)
	{
		Integer tmp = arr[low];
		while(low<high)
		{
			while(low<high&&arr[high]>tmp)
			{
				high--;
			}
			arr[low]=arr[high];
			while(low<high&&arr[low]<tmp)
			{
				low++;
			}
			arr[high]=arr[low];
			
		}
		arr[low] = tmp;
		return low;
	}
	
	public void quickSort(Integer[] arr,int low,int high)
	{
		if(low<high)
		{
			int mid = getMid(arr,low,high);
			quickSort(arr,low,mid-1);
			quickSort(arr,mid+1,high);
		}
	}
}
