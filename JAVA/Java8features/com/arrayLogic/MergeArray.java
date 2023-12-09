package com.arrayLogic;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]= {40,50,60,55};
		int aLength=a.length;
		int bLength=b.length;
		int cLength=aLength+bLength;
		int c[]=new int[cLength];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		/*for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
			
		}*/
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
				

	}

}
