package com.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDescendingOrder {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,5,45,8,20,7,22);
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
