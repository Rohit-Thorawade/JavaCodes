package com.javapractice.arrays;

import java.util.Scanner;

public class LearnArray {
	
	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter size");
		int size = sc.nextInt();

		
		int []mark = new int [size];
		
		for(int i=0;i<size;i++)
		{
			mark[i]=sc.nextInt();//storing value
		}
		
		
		
		System.out.println("number to be found");
		
		int find = sc.nextInt();
			
		for(int i=0;i<size;i++)
		{
			
			
			if(mark[i]==find)
			{
				System.out.println("number found at index:"+ i); //number found : Linear Search
			}
			
			
		}
		
		
		// find max element 
		  int temp =0;
		  
	        for(int i =0;i<size;i++)
	        {
	            for(int j=i+1;j<size;j++)
	            {
	                if(mark[i]<mark[j])
	                {
	                    temp=mark[i];
	                    mark[i]=mark[j];
	                    mark[j]=temp;
	                }
	            }
	        }
	        System.out.println("largest element:"+mark[0]);
		
		 
		 
	}

}
