package com.java8.features.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * 【1】.Java 8 Predicate :
 *  Predicate is used for filtering the Collection's element
 * @author 祷
 */
public class PredicateTest {
	public static void main(String[] args) {
		Collection<String> books  = new ArrayList<>();
		books.add(new String("轻量级Java EE企业应用实战"));  
        books.add(new String("疯狂Java讲义"));  
        books.add(new String("疯狂iOS讲义"));  
        books.add(new String("疯狂Ajax讲义"));  
        books.add(new String("疯狂Android讲义"));
        
        //count the numbers which element contains the "crazy"!
        System.out.println(countRequirements(books,ele->((String)ele).contains("疯狂")));
	}
	
	/**
	 * the method is used for counting the numbers of the eligible(有效的) elements in the collection
	 * @param collection
	 * @param predicate
	 * @return
	 */
	public static <T> int  countRequirements(Collection<T> collection , Predicate<T> predicate){
		int total = 0;
		for(T t:collection){
			if(predicate.test(t)){
				total++;
			}
		}
		return total;
	}
}
