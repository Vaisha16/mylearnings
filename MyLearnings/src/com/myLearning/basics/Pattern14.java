package com.myLearning.basics;

public class Pattern14 {
	public static void main(String arg[]){
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<i;j++)
			{	
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println("");
			System.out.print("");
		}
	}
}
