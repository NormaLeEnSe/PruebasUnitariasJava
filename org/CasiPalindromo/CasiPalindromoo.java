package org.CasiPalindromo;

public class CasiPalindromoo {
	public static boolean isAlmostPalindrome(String word) {
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        if (isPalindrome(word)) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char originalChar = word.charAt(i);

            for (char replacement = 'a'; replacement <= 'z'; replacement++) {
                if (replacement != originalChar) {
                    String modifiedWord = word.substring(0, i) + replacement + word.substring(i + 1);
                    if (isPalindrome(modifiedWord)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
