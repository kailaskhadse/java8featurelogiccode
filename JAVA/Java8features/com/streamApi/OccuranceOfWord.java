package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class OccuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="every one is loyal and loyal is good";
		List<String> list=Arrays.asList(str.split(" "));
		System.out.println(list);
		Map<String,Long>map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		//Map<String,Long>nmap=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(nmap);
		String s="kailas";
		List<String>list1=Arrays.asList(s.split(""));
		System.out.println(list1);
		Map<String,Long>m1=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     System.out.println(m1);
	}

}
