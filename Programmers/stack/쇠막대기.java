package Programmers.stack;

import java.util.Stack;

public class ¼è¸·´ë±â {

	public static void main(String[] args) {
	

	
	}

}

class Solution01 {
    public int solution(String arrangement) {
        int answer = 0;
    	Stack<Integer> stack = new Stack<>();
    	
    	
    	for(int i=0;i<arrangement.length();i++) {
    		if(arrangement.charAt(i)=='(') {
    			stack.push(i);
    		}else{
    			if(arrangement.charAt(i-1)=='(') {
    				stack.pop();
    				answer += stack.size();
    			}else {
    				stack.pop();
    				answer += 1;
    			}
    		}
    	}
    	
        return answer;
    }
}
