package com.shurrik.algorithm;

//冒泡排序
public class BubbleSort {

    public static void main(String[] args) {
        
        int[] arr = {4,54,9,77,12,44,9,10,45,63};
        sort(arr);
        for(int item:arr)
        {
            System.out.print(item+",");
        }
    }
    
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tmp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print("第"+i+"轮:");
            for(int item:arr)
            {
               System.out.print(item+",");
            }
            System.out.println();
        }
    }
}
