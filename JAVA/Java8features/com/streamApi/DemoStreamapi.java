package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(15,4,6,19,18,55);
		//list.stream().map(x->x +"").filter(x->x.startsWith("1")).forEach(x->System.out.print(x));
	int max=list.stream().max(Integer::compare).get();
		System.out.println("Maximum num: "+max);
		int min=list.stream().min(Integer::compare).get();
		System.out.println("Minimmum num: "+min);
		List<String>list1=Arrays.asList("s","k","m","c","d");
		List<String> l=list1.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted string :"+l);
		String maxs=list1.stream().min(Comparator.comparing(String::valueOf)).get();
		System.out.println("Maximum string: "+maxs);
	//	Long l=list.stream().count();
      //  System.out.println(l);
	}

}
