package com.strings;

public class P5LongestPalindromeSubstr {

    public String longestPalindrome(String s) {

        int[][] dp = new int[s.length()][s.length()];


        int start = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
            start  = i;
            max = 1;
        }

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = 1;
                start = i;
                max = 2;
            }
        }

        for(int k = 3; k <= s.length(); k++){

            for(int i = 0; i < s.length()-k+1; i++){

                int j = i + k - 1;

                if(dp[i+1][j-1]==1 && s.charAt(i)==s.charAt(j)){
                    dp[i][j] = 1;

                    if(k > max){
                        max = k;
                        start = i;
                    }
                }

            }
        }

        return s.substring(start, start+max);


    }
}
