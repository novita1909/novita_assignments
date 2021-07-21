package com.coreJavaAssignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NewsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<News> newsList=new ArrayList<>(Arrays.asList(new News(101,"Ankita Sharma","nice","nice"),
														new News(102,"Divyanka Tripathi","dramatic","drama"),
														new News(103,"Honey","good","interesting"),
														new News(103,"Ishita","fabulous","interesting"),
														new News(103,"Sanjay Mishra","legendry","interesting"),
														new News(101,"Sanjay Mishra","supergood","interesting"),
														new News(102,"Sanjay Mishra","awesome","interesting")));
		
		
		System.out.println("NewsId with maximum comments--");
		News newsIdmaxComments=newsList.stream()
				.max(Comparator.comparing(News::getNewsId))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(newsIdmaxComments);
		System.out.println("-------------------------------");
		
		
		System.out.println("User who has posted maximum comments--");
		News usermaxComments=newsList.stream()
				.max(Comparator.comparing(News::getPostedByUser)
						).orElseThrow(NoSuchElementException::new);
		System.out.println(usermaxComments);
		System.out.println("-------------------------------");
		
		/*System.out.println("commentByuser wise number of comments");
		List<News> commentByUser=newsList.stream().sorted(Comparator.comparing(News::getCommentByUser)).collect(Collectors.toList()); 
		 
		commentByUser.forEach(System.out::println);
		
		System.out.println();
		System.out.println("-------------------------------");*/
		
		
		System.out.println("Number of times word interesting arrived in comments");
		long countNo = newsList.stream().filter(o -> o.getComment().equals("interesting")).count();
		System.out.println(countNo);
		System.out.println("-------------------------------");
		
		
		System.out.println("postedByuser wise number of comments");
		Map<String, Long> mp =newsList.stream()
				.map(o -> o.getPostedByUser())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mp);
		
	}

}
