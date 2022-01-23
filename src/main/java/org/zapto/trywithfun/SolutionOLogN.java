package org.zapto.trywithfun;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class SolutionOLogN {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i < height.length; i++) {
            int heightLeft = height[i];

            int area = 0;
            for(int j = 0; j < height.length - i; j++) {
                int heightRight = height[height.length - j - 1];
                int distance = height.length - i - j - 1;
                if(heightLeft * distance <= maxArea) {
                    break;
                }
                area = max(area, min(heightLeft, heightRight) * distance);
                if(heightRight >= heightLeft) {
                    break;
                }
            }

            maxArea = max(maxArea, area);
        }
        return maxArea;
    }
}
