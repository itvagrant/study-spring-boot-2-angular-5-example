package com.java8.features.demo;

import java.util.Arrays;
import java.util.Collection;


/**
 * the Lambda Second Step : used in the collection expression! it'll be so simple to iterator!
 * @author 祷
 *
 */
public class LambdaSecondStep {
	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("A","B","C");
		
		//before java8
		System.out.println("Before Java 8! We use the for-each expression to iterator the collection!");
		for(String str:collection){
			System.out.println(str);
		}
		//after java 8 
		System.out.println("After Java 8 !Its the best choice to use the Lambda to iterator it!");
		collection.forEach(x->System.out.println(x));
		//or used the scala expression in Lambda , Scala Expression Teaching:http://www.runoob.com/scala/scala-tutorial.html
		System.out.println("Scala Expression In Lambda！");
		collection.forEach(System.out::println);
	}
}
