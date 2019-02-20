package Programmers.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ž {
	public static void main(String[] args) {
		test02 t = new test02();
		int[] arr = {6, 9, 5, 7, 4};
		for(int i:t.solution(arr)) {
			System.out.print(i);
		}
		
	}
}
class test02 {
    public int[] solution(int[] heights) {
        
        int[] result = new int[heights.length];
        Arrays.fill(result,0);
        
        
        for(int i=heights.length-1;i>0;i--) {
        	int num = 0;
            int current_value = heights[i];
        	for(int j= i-1;j>=0;j--) {
        		num++;
        		if(current_value>=heights[j]) {
        		}else {
        			result[i] = i+1-num;
        			break;
        		}
        	}
        	
        	
        }
       

        
        return result;
    }
}