package com.arrayLogic;

public class MaxNumber {

	public static void main(String[] args) {
		int a[]= {10,15,8,50,65};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				
			}
			else if(min>a[i]) {
			min=a[i];
		}}
System.out.println("max number :"+max);
System.out.println("minnumber :"+min);
	}

}
