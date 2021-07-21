package com.coreJavaAssignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TradersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trader> tradersList=new ArrayList<>(Arrays.asList(new Trader("novita","amritsar"),
				new Trader("ankit","indore"),
				new Trader("dhruv","delhi"),
				new Trader("karan","indore"),
				new Trader("amit","pune"),
				new Trader("yuvraj","pune"),
				new Trader("tushar","pune"),
				new Trader("isha","banglore")));
		
		System.out.println("Traders based in Indore--- ");
		List<String> list=tradersList.stream()
		.filter(p->p.getCity().equals("indore"))
		.map(o->o.getName()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("---------------------------------");
		
		
		
		List<String> sortedList = tradersList.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.map(o->o.getName())
				.collect(Collectors.toList());
		System.out.println("Sorted List Of Traders Name--");
		sortedList.forEach(System.out::println); 
		System.out.println("--------------------------------");
		
		System.out.println("Traders Living in Pune are---");
		List<String> sortedByCity=tradersList.stream()
				.filter(p->p.getCity().equals("pune"))
				.sorted(Comparator.comparing(Trader::getName))
				.map(o->o.getName())
				.collect(Collectors.toList());
		sortedByCity.forEach(System.out::println);
		System.out.println("-------------------------------");
		
		
		System.out.println("Unique cities where traders work are--");
		List<String> distinctCity = tradersList.stream()
				.filter(distinctByKey(p -> p.getCity()))
				.map(o->o.getName())
				.collect(Collectors.toList());
		System.out.println(distinctCity);
		System.out.println("-------------------------------");

	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
	{
		Map<Object, Boolean> uniqueMap = new ConcurrentHashMap<>();
		return t -> uniqueMap.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}