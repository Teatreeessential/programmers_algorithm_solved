package Programmers.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능구현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
	 public int[] solution(int[] progresses, int[] speeds) {
	     List<Integer> list = new ArrayList<>();
		 int[] complete_day = new int[progresses.length];
	     Queue<Integer> q = new LinkedList<>();
	     
	     for(int i=0;i<progresses.length;i++) {
	    	 int day = 0;
	    	 while((progresses[i]+=speeds[i])<100) day++;
	    	 complete_day[i] = day;
	     }
	     
	     q.offer(complete_day[0]);
	     
	     for(int i=1;i<complete_day.length;i++) {
	    	 if(q.peek()>=complete_day[i]) {
	    		 q.offer(complete_day[i]);
	    	 }else {
	    		 list.add(q.size());
	    		 q.clear();
	    		 q.offer(complete_day[i]);
	    	 }
	     }
	     
	     list.add(q.size());
		 
	     int[] result = new int[list.size()];
	     
	     for(int i=0;i<list.size();i++) {
	    	 result[i] = list.get(i);
	     }
	     
	     return result;

	        
	 }
}