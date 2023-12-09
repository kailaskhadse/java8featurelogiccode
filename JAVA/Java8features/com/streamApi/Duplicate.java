package com.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(10,5,66,5,8,10,10);
		Set<Integer>dup=new HashSet<>();
//		list.stream().filter(n->!dup.add(n)).forEach(s->System.out.println(s));
//        list.stream().findFirst().ifPresent(System.out::println);
//        //total number of element present
//        System.out.println("total number element :"+list.stream().count());
//        //sort element
//        list.stream().sorted().forEach(System.out::print);
       // list.stream().filter(x-> x>8).collect(Collectors.toList()).forEach(x->System.out.println(x));
        list.stream().filter(x->!dup.add(x)).forEach(System.out::println);  //5,10,10
      //  list.stream().filter(x->!dup.add(x)).collect(Collectors.toSet()).forEach(System.out::println);//5,10              
        
	}

}
