package com.shurrik.algorithm;

public class SmallestDiff {
	
	public static int m,n,record;
	
	public static boolean initFlag = false;

	public static void main(String[] args) {
		
		int[] arr = {1,4,8,42,12,6,90,100,102,77,23};
		getDiff(arr);

		System.out.println("m:"+m);
		System.out.println("n:"+n);
		System.out.println("record:"+record);

		
	}
	
	public static void  getDiff(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					continue;
				}
				
				int tmp = Math.max(arr[i], arr[j]) - Math.min(arr[i], arr[j]);
				if(!initFlag)
				{
					record = tmp;
					m = Math.min(arr[i], arr[j]);
					n = Math.max(arr[i], arr[j]);
					initFlag =true;
				}
				else
				{
					if(tmp<record)
					{
						record = tmp;
						m = Math.min(arr[i], arr[j]);
						n = Math.max(arr[i], arr[j]);
					}
				}
			}
		}
		
		
	}
}
