package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>list=new ArrayList<>();
		list.add(new Employee(1,"kk",5000));
		list.add(new Employee(2,"pk",8000));
		list.add(new Employee(3,"nk",9000));
		//list.stream().map(e->e.geteSalary()*120/100).forEach(x->System.out.println(x));
		//list.stream().filter(x->x.geteSalary()>=8000).forEach(y->System.out.println(y));
		//list.stream().map(x->x.geteSalary()+3000).forEach(x->System.out.println(x));
		List<String> slist=Arrays.asList("ajay","aray","kajal","priya");
		//slist.stream().map(s->s.toUpperCase()).forEach(y->System.out.println(y));
		//slist.stream().filter(s->s.startsWith("a")).forEach(s->System.out.println(s));
		
 
	}

}
