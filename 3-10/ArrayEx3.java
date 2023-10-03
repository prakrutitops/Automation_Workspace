package com.poly;

import java.util.Scanner;

public class ArrayEx3 
{
	public static void main(String[] args) 
	{
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Value");
		int value = sc.nextInt();
		
		int arr[] = new int[value];
		int num[] =new int[value];
		for(int i=0;i<value;i++)
		{
			System.out.println("Enter Your Number:");
			num[i] = sc.nextInt();

		}
		
		for(int i=0;i<value;i++)
		{
			System.out.println(num[i]);
		}
		
		
		
		
		
		
	}
}
