package com.example.tdd_11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Calculator {
	public static int plus(int a,int b) {
		//return 3;
		return a+b;
	}
	/*
	 public static void main(String[] args) {
		 SpringApplication.run(Tdd11Application.class, args);

		 }
	}
	 */
}
