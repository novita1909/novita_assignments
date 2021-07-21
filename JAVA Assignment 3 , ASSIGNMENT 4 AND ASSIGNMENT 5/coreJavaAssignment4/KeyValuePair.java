package com.coreJavaAssignment4;

import java.util.*;

public class KeyValuePair {
	public static void main(String[] args) {
		Map<String,Integer> mp=new TreeMap();
		mp.put("First ", 1);
		mp.put("Second ", 2);
		mp.put("Third ", 3);
		mp.put("Fourth ", 4);
		
		StringBuilder sb=new StringBuilder();
		mp.entrySet().forEach(s->sb.append(s.getKey()).append(s.getValue()).append(","));
		
		System.out.println(sb.toString());
	}
}
