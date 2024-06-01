package com.pattern.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternTriangularApplication {
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 8; i++) {
			for(j = 8; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
