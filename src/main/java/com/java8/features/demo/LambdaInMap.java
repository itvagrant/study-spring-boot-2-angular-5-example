package com.java8.features.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Lambda In Map Expression!
 * the Map : is not the java.util.Map;
 * map(): its used to replace the object by other object ,look the sample!
 * map() is based in Stream Object in Java 8,yes! Stream is a new Object Since Java 8 ,and of course ,the stream() is
 * the new method since Java 8!
 * map and reduce are the pairs!
 * @author 祷
 *
 */
public class LambdaInMap {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C");
		//map
		System.out.println("Lambda in Map!");
		list.stream().map(x->x+"E").forEach(System.out::println);
		System.out.println("Lambda in Map by The Method!");
		list.stream().map(x->addStr(x)).forEach(System.out::println);
	}
	//of course , we can use method in "->" lambda expression!
	public static Object addStr(Object x){
		return x+"E";
	}
}
