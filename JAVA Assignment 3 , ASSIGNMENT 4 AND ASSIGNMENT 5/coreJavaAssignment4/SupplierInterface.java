package com.coreJavaAssignment4;

import java.util.Arrays;
import java.util.List;

public class SupplierInterface {
	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("hello","world","how","are","you");
		System.out.println(list.stream().findAny());
	}
}
