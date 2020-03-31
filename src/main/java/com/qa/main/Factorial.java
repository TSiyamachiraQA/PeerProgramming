package com.qa.main;

public class Factorial {

	public int fact(double n) {
		int i = 0;

		while (n > 1) {
			i++;
			n = n / i;
		}

		if (n == 1) {
			return i;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.fact(3) + "!");

	}

}
