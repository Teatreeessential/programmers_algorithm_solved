package Programmers.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 스킬트리 {

	public static void main(String[] args) {
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		String skill = "CBD";
		System.out.println(solution(skill, skill_trees));
		
	}
	 public static int solution(String skill, String[] skill_trees) {
	        int answer = 0;
	        String[] arr = skill.split("");
	        //앞의 스킬을 선행하였는지를 알려줘야함
	        for(String s:skill_trees) {
	        	int flag = 1;
	        	int count = 0;
	        	
	        	for(int i =0;i<s.length();i++) {
	        		if(skill.indexOf(s.charAt(i)) != -1){
	        			if(count == skill.indexOf(s.charAt(i))){
	        				count++;
	        			}else {
	        				flag = -1;
	        				break;
	        			}
	        		}

	        	}
	        	if(flag == 1) answer++;
	        }
	        
	        
	        return answer;
	    }
}
