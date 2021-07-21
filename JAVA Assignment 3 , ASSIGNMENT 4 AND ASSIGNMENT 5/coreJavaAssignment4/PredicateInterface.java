package com.coreJavaAssignment4;

import java.util.function.Predicate;  
public class PredicateInterface {  
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18);
        System.out.println(pr.test(10));    
    }
}  
