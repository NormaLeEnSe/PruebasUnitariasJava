package org.CasiPalindromo;

import org.junit.Test;


public class CasiPalindromooTest{

	    @Test
	    public void testIsAlmostPalindrome() {
	        assertIsAlmostPalindrome("Oso");
	        assertIsAlmostPalindrome("Ver");
	        assertIsAlmostPalindrome("Hola");
	        assertIsAlmostPalindrome("Ocho");
	        assertIsAlmostPalindrome("Veronica");
	        assertIsAlmostPalindrome("Anita lavó la tina");
	       
	    }

	    private void assertIsAlmostPalindrome(String word) {
	        boolean result = CasiPalindromoo.isAlmostPalindrome(word);
	        System.out.println("La palabra " + word + " ---> " + result);
	    }
	}


