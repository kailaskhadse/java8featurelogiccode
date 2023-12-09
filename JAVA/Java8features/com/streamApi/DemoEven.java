package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= {4,1,3,6,7,8,9};
	int sum=	Arrays.stream(i).filter(m->m%2==0).sum();
	System.out.println("sum of even num :"+sum);

	}

}
