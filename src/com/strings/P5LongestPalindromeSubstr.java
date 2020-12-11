package com.strings;

public class P5LongestPalindromeSubstr {

    public String longestPalindrome(String s) {

        int[][] dp = new int[s.length()][s.length()];


        int start = 0;
        int len = 0;

        for(int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
            start  = i;
            len = 1;
        }

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = 1;
                start = i;
                len = 2;
            }
        }

        for(int k = 3; k < s.length(); k++){

            for(int i = 0; i < s.length()-k+1; i++){

            }


        }


    }
}
