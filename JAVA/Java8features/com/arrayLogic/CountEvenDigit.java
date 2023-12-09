package com.arrayLogic;

public class CountEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {121,1245,65,98785};
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			int count=0;
			while(n!=0) {
				n=n/10;
				count++;
			}
			if(count%2==0)
				System.out.println("Even :" +a[i]);
			else
				System.out.println("odd : "+a[i]);
		}

	}

}
