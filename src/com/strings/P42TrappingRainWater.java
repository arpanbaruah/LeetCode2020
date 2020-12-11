package com.strings;

public class P42TrappingRainWater {

    public int trap(int[] height) {

        if(height.length == 0) return 0;

        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int total = 0;

        left[0] = height[0];
        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        int n = height.length-1;

        right[n] = height[n];
        for(int j = n-1; j >=0; j--){
            right[j] = Math.max(right[j+1], height[j]);
        }

        for(int i = 0; i <= n ; i++){
            total += Math.min(left[i], right[i]) - height[i];
        }

        return total;
    }

    public  static void main(String ... args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        P42TrappingRainWater pb = new P42TrappingRainWater();

        System.out.println(pb.trap(height));
    }
}
