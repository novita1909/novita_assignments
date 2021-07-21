package com.coreJavaAssignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class TransactionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transaction> transactionList=new ArrayList<>(Arrays.asList(new Transaction(new Trader("nikita","chandigarh"),1996,60000),
				(new Transaction(new Trader("anmol","canada"),2011,96000)),
				(new Transaction(new Trader("ambica","mumbai"),1986,29000)),
				(new Transaction(new Trader("ravi","delhi"),1964,33000)),
				(new Transaction(new Trader("vijay","delhi"),2011,9600))));
		
		
		System.out.println("Transaction with smallest value-- ");
		Transaction smallestValue=transactionList.stream().min(Comparator.comparing(Transaction::getValue))
			      .orElseThrow(NoSuchElementException::new);
		
		System.out.println(smallestValue);
		System.out.println("-------------------------------");
		
		
		System.out.println("Highest value of all transactions--");
		Transaction largestValue=transactionList.stream().max(Comparator.comparing(Transaction::getValue))
			      .orElseThrow(NoSuchElementException::new);
		
		System.out.println(largestValue);
		System.out.println("-------------------------------");
		
		
		System.out.println("Transaction values for traders living in Delhi--");
		transactionList.stream().filter(p->p.getTrader().getCity().equals("delhi")).forEach(p->System.out.println(p.getValue()));
		System.out.println("-------------------------------");
		
		System.out.println("Transactions made in the year 2011--");
		List<Transaction> sortedByValue=transactionList.stream().filter(p->p.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		sortedByValue.forEach(System.out::println);
	}

}
