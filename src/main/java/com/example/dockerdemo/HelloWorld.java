package com.example.dockerdemo;

import java.util.Properties;

import org.springframework.stereotype.Service;
@Service
public class HelloWorld {

	public static void printSystemProperies() {
		System.out.println("printing System properties using java program");
		 Properties properties = System.getProperties();
		 System.out.println(properties);
	}
}
