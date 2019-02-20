package Programmers.heap;

import java.util.PriorityQueue;

import Programmers.Tools;
import Programmers.test;

public class 이중우선순위큐 {
	public static void main(String[] args) {
		String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		Tools.showArr(solution(operations));
	}
	
	public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> min_pq = new PriorityQueue<>();
        PriorityQueue<Integer> max_pq = new PriorityQueue<>((a,b) -> b-a);
        int min_count=0;
        String command = null;
        int number = 0;
        
        for(String operation: operations) {
        	String[] arr = operation.split(" ");
        	command = arr[0];
        	number= Integer.parseInt(arr[1]);
        	
        	
        	switch(command) {
				case "I":
	        		max_pq.add(number);
	        		break;
				case "D":
					if(number > 0) {
						if(!max_pq.isEmpty()) max_pq.poll(); 
					}else {
						if(!min_pq.isEmpty()) min_pq.clear();
						min_pq.addAll(max_pq);
						min_pq.poll();
						if(!max_pq.isEmpty()) max_pq.clear();
						max_pq.addAll(min_pq);
					}
        	}
        	
        }
        
        if(max_pq.isEmpty()) {
        	answer[0] = 0;
        	answer[1] = 0;
        }else {
        	answer[0] = max_pq.poll();
        	min_pq.addAll(max_pq);
        	answer[1] = min_pq.poll();
        }     
        
        return answer;
    }
}
