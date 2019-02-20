package Programmers.heap;

import java.util.PriorityQueue;

public class 라면공장 {
	public static void main(String[] args) {
		
		
	}
	 public static int solution(int stock, int[] dates, int[] supplies, int k) {
	        int answer = 0;
	        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
	        
	        k -= stock;
	        if(k<=0) return answer;
	        
	        
	      
	        int spidx = 0;
	        for(int day =0; day<k;day++) {
	        	if(spidx<dates.length&&day>=dates[spidx]) {
	        		pq.offer(supplies[spidx]);
	        		spidx++;
	        	}
	        	
	        	if(stock<=0) {
	        		stock+=pq.remove();
		        	answer++;
	        	}
	        	
	        	stock--;
	        }
	        	
	        
	        return answer;
	 }
}
