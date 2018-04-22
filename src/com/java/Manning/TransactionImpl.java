package com.java.Manning;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traders tt = new Traders();
		List<Transaction> listOfTransaction = tt.getAllTransaction();
		List<Dish> dishes = new ListDish().getDishList();
		// Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> sortingTransaction = listOfTransaction.parallelStream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println(sortingTransaction);

		// What are all the unique cities where the traders work?
		listOfTransaction.parallelStream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::print);
		// 3.  Find all traders from Cambridge and sort them by name.
		listOfTransaction.parallelStream().map(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
				.collect(Collectors.toList());

		// 4.  Return a string of all traders’ names sorted alphabetically.
		/*
		 * List<String> listFoName=listOfTransaction.parallelStream().
		 * .sorted(Comparator.comparing(Trader::getName)) .map()
		 * .collect(Collectors.toList());
		 */
		// 5.  Are any traders based in Milan?
		// 6.  Print all transactions’ values from the traders living in Cambridge.
		// 7.  What’s the highest value of all the transactions?
		// 8.  Find the transaction with the smallest value.

		// int calories = dishes.stream().map(Dish::getCalories).reduce(identity,
		// accumulator);
		IntSummaryStatistics menuStatistics = dishes.stream().collect(Collectors.summarizingInt(Dish::getCalories));
		System.out.println(menuStatistics);

		String shortMenu = dishes.stream().map(Dish::getName).collect(Collectors.joining(","));
		System.out.println("Short Menu =" + shortMenu);
		int totalCalories = dishes.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
		System.out.println("totalCalories =" + totalCalories);
	}

}
