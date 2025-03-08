package br.com.daniel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeTest {

	@Test
	void test() {
		System.out.println("Primeiro teste executado!");
	}
	
	@Test
	void testSoma() {
	System.out.println("Teste não executado");
	}
	
	@Test
	void testSubtracao() {
		var numero1 = 10;
		var numero2 = 5;
		var sub = numero1 - numero2;
		var actual = sub;
		var expected = 5;
		assertEquals(expected, actual);
		System.out.println();
	}

}
