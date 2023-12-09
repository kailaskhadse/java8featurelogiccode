package com.arrayLogic;

public class InterSectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {7,6,4,3,2,};
		int arr2[]= {4,3,6,9,10};
		int result=arr1[0];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					result=arr1[i];
					System.out.println(result);
				}
			}
		}
		

	}

}
