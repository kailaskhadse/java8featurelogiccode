package com.arrayLogic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=151;
		int rem=0;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;}
			if(rem==temp)
				System.out.println("ArmstrongNumber");
			else {
				System.out.println("Not armstrong num");
			}
			
		}

	}

