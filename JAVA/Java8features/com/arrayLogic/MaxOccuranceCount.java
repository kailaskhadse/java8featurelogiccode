package com.arrayLogic;

public class MaxOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[]= {10,20,5,10,10,5,6,20};
           int maxCount=0;
           int rep=0; int count=1;
          
           for(int i=0;i<a.length;i++) {
        	   for(int j=0;j<a.length;j++) {
        		   if(a[i]==a[j]) {
        			   count++;
        			   System.out.println(count);
        		   }
        	   
           }if(maxCount<count) {
        	   maxCount=count;
        	   rep=a[i];
        	   
           }}
           System.out.println(rep +" " +maxCount);
	}

}
