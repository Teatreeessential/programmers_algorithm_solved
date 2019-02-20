package Programmers.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import Programmers.Tools;

public class 주식가격 {

	public static void main(String[] args) {
		int[] arr = {300,400,1000,1000};
		
		Tools.showArr(solution(arr));
		
	}



    public static int[] solution(int[] prices) {
        
        int[] answer;
        
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        
        stack.push(prices[0]);
        
        for(int i = 1; i<prices.length;i++) {
        	if(stack.peek()<=prices[i]) {
        		stack.push(prices[i]);
        	}else {
        		while(!stack.isEmpty()) {
        			list.add(stack.size());
        			stack.pop();
        		}
        		stack.push(prices[i]);
        		
        	}
        	
        }
        while(!stack.isEmpty()) {
			list.add(stack.size()-1);
			stack.pop();
		}
        
        answer = new int[list.size()];
    	
		
        for(int i = 0;i<list.size();i++) {
        	answer[i] = list.get(i);
        }
        
        
        return answer;
    }

}
