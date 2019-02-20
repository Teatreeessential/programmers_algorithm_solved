package Programmers.stack;

import java.util.LinkedList;
import java.util.List;

public class «¡∏∞≈Õ {
	public static void main(String[] args) {
		Solution02 sol = new Solution02();
		
		int [] priority = {1, 1, 9, 1, 1, 1};
		
		System.out.println(sol.solution(priority,1));

		
	}
}

class Solution02 {
    public int solution(int[] priorities, int location) {
        
    	LinkedList<paper> list = new LinkedList<>();
    	int answer = 1;
    	boolean flag = true;
    	
    	for(int i=0;i<priorities.length;i++) {
    		paper p = new paper();
    		p.setLocation(i);
    		p.setPriority(priorities[i]);
    		list.add(p);
    	}
    	
    	while(!list.isEmpty()) {
    		flag = true;
    		paper p = list.getFirst();
    		for(int i=0;i<list.size();i++) {
    			if(p.getPriority()<list.get(i).getPriority()) {
    				flag = false;
    				break;
    			}
    		}
    		if(flag) {
    			if(p.getLocation()==location) break;
    			list.removeFirst();
    			answer++;
    		}else {
    			list.removeFirst();
    			list.addLast(p);
    		}
    		
    		
    	}
    	
    	
        return answer;
    }
    

}

class paper{
	
	private int priority;
	private int location;
	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	
	
}
