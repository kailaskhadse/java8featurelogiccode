package com.arrayLogic;

import java.util.Arrays;
import java.util.List;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(11,22,5,9,7,20);
		int max=list.stream().max(Integer::compare).get();
		System.out.println(max);
		int min=list.stream().min(Integer::compare).get();
		System.out.println(min);

	}

}
