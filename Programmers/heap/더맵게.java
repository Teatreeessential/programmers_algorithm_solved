package Programmers.heap;

import java.util.PriorityQueue;

public class ´õ¸Ê°Ô {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 9, 10, 12};
		System.out.println(solution(arr, 7));
	}
	
	 public static int solution(int[] scoville, int K) {
	        
		 	int answer = 0;
		 	PriorityQueue<Integer> pq = new PriorityQueue<>();
		 	
		 	for(Integer i:scoville) {
		 		pq.offer(i);
		 	}
		 	
		 	while(pq.peek()<K) {
		 		int first = pq.poll();
		 		int second = pq.poll();
		 		
		 		pq.offer(first+second*2);
		 		answer++;
		 	}
		 	
	        return answer;
	 }
}
