package com.coreJavaAssignment3;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
	Map<String, Integer> map=new ConcurrentHashMap<String, Integer>();
				map.put("Hello", 10);
				map.put("World", 20);
				map.put("John", 30);
				System.out.println(map);
				
				Set<java.util.Map.Entry<String, Integer>> entry= map.entrySet();
				Iterator<java.util.Map.Entry<String, Integer>> itr=entry.iterator();
				while(itr.hasNext())
				{
					map.put("Kritu", 100);
					System.out.println(itr.next());
				}
			}
		}

	


