package com.coreJavaAssignment5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitList {
	public static void main(String[] args) {
		List<Fruit> fruitList=new ArrayList<>(Arrays.asList(new Fruit("banana",5,10,"yellow"),
														  new Fruit("apple",7,15,"red"),
														  new Fruit("grapes",4,8,"green"),
														  new Fruit("orange",2,7,"orange"),
														  new Fruit("litchi",2,9,"red")));
		
		System.out.println("Only RED Fruits--");
		List<String> sortByPrice=fruitList.stream()
				.filter(p->p.getColor().equals("red"))
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(o->o.getName())
				.collect(Collectors.toList());
		sortByPrice.forEach(System.out::println);
		System.out.println();
		System.out.println("-------------------------------");
		
		
		System.out.println("Fruit Names of low calorie fruits--");
		List<String> sortByCalories=fruitList.stream()
				.filter(p->p.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.map(o->o.getName())
				.collect(Collectors.toList());

		sortByCalories.forEach(System.out::println);
		System.out.println("-------------------------------");
		
		
		
		/*List<Fruit> sortByColor=fruitList.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList()); //2
		 
		sortByColor.forEach(System.out::println);
		System.out.println("****************************************************************");
		for(int i=0; i<sortByColor.size(); i++)
		System.out.println(sortByColor.get(i).getName()); */
		
		System.out.println("Color wise list of fruit name--");
		List<String> fl = fruitList.stream()
							.sorted(Comparator.comparing(Fruit::getColor))
							.map(o -> o.getName())
							.collect(Collectors.toList());
		System.out.println(fl);
		System.out.println("-------------------------------");
		
		/*int fp = fruitList.stream()
				.map(o -> o.getPrice())
				.reduce((o1, o2) -> o1+o2).get();
		System.out.println(fp);
		System.out.println("*********************************");*/
		
		/*Map<String, List<Fruit>> mp = fruitList.stream()
				.collect(Collectors.groupingBy(Function.identity().toString(), Collectors.toList()));
		System.out.println(mp);*/
	}
}
