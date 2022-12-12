package com.showroom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Soluction {
	public static void main(String[] args) {
		System.out.println("printing statement");
		ClassPathXmlApplicationContext C= new ClassPathXmlApplicationContext("com/showroom/congf1.xml");
		Customer C1=(Customer) C.getBean("cust");
		System.out.println(C1);
	}
}
