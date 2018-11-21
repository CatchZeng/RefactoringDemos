package com.catchzeng.refactoringdemos.r2_long_method;

public class LongMethod {
    public boolean isReversedMakeblock(String[] words) {
        boolean result = false;

        // Loop through the array of Strings
        for (int i = 0; i < words.length; i++) {
            String argument = "";
            // Reverse the characters in each String
            for (int j = words[i].length(); j > 0; j--) {
                argument += words[i].substring(j - 1, j);
            }
            words[i]=argument;
        }

        // Test for two particular Strings
        if (words.length == 2) {
            if (words[0].toLowerCase().equals("make")
                    && words[1].toLowerCase().equals("block")) {
                result = true;
            }
        }
        return result;
    }
}










//Hints
//reverseCharacters, isMakeblock
