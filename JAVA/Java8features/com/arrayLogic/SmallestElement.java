package com.arrayLogic;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,3,2,5,7,8,9};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
    for(int i=0;i<a.length;i++) {
    	System.out.println(" "+a[i]);
    }
    
	}

}
