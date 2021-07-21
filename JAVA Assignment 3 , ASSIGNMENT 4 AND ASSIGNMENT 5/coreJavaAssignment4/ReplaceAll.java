package com.coreJavaAssignment4;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("ankit");
		list.add("novita");
		list.add("honey");
		list.add("ravinder");
          list.replaceAll(o->o.toUpperCase());
          System.out.println(list);
	}



}
