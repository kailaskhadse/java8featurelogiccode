package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(14,20,30,28,6,56);
		Integer thirdMax=list.stream().sorted(Collections.reverseOrder()).distinct().limit(3).skip(2).findFirst().get();
		System.out.println(list.stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList()));
		
		System.out.println(list.stream().sorted(Collections.reverseOrder()).distinct().limit(3).collect(Collectors.toList()));
		System.out.println(list.stream().sorted(Collections.reverseOrder()).distinct().limit(3).skip(2).collect(Collectors.toList()));
		
		System.out.println(thirdMax);
	}
}
