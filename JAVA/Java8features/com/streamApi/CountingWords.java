package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class CountingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=Arrays.asList("kailas","rutuja","dipika","komal","kailas");
	long num=list.stream().filter(i->i.equals("kailas")).count();
     System.out.println("no. of kailas :" +num);
	}

}
