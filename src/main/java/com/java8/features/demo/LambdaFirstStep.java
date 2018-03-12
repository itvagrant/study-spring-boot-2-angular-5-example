package com.java8.features.demo;

/**
 * the first feature of the Lambda expression: replace the anonymity(匿名的) inner class
 * use the ()->
 * @author 祷
 *
 */
public class LambdaFirstStep {
	
	public static void main(String[] args) {
		//be fit for the simple single logic(逻辑)!
		new Thread(()->System.out.println("this is the lambda expression in anonymity inner class!")).start();
		//be fit for the complicated logic in method!
		new Thread(()->syso()).start();
		//traditional way ,in the anonymity inner class!
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("this is the traditional way to use the anonymity innerr class");
			}
		}).start();
	}
	/*
	 * Method to be uesed in Lambda! 
	 */
	public static void  syso(){
		System.out.println("this is the lambda expression used by method way!");
	}
}
