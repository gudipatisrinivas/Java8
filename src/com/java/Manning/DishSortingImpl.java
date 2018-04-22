package com.java.Manning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DishSortingImpl {
	public static void main(String[] args) {
		List<Dish> dishes = new ListDish().getDishList();
		List<Dish> dish=dishes.stream().filter(d->d.getType()==Dish.Type.FISH).collect(Collectors.toList());
		System.out.println(dish);
		System.out.println("Any Match\t"+dishes.stream().anyMatch(d -> d.getCalories() < 500));
		System.out.println("All Match\t"+dishes.stream().allMatch(d -> d.getCalories() < 500));

		System.out.println("none Match\t"+dishes.stream().noneMatch(d -> d.getCalories() >1500));
		List<Integer> numbers=List.of(4,5,7,8);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
	}}
