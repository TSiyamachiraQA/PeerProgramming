package com.qa.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void sample1() {
		Factorial f = new Factorial();
		assertEquals("", 5, f.fact(120));
	}

	@Test
	public void sample2() {
		Factorial f = new Factorial();
		assertEquals("", 0, f.fact(150));
	}

	@Test
	public void challenge1() {
		Factorial f = new Factorial();
		assertEquals("", 10, f.fact(3628800));
	}

	@Test
	public void challenge2() {
		Factorial f = new Factorial();
		assertEquals("", 12, f.fact(479001600));
	}

	@Test
	public void challenge3() {
		Factorial f = new Factorial();
		assertEquals("", 3, f.fact(6));
	}

	@Test
	public void challenge4() {
		Factorial f = new Factorial();
		assertEquals("", 0, f.fact(18));
	}
}
