package Programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<completion.length;i++) {
        	if(null==map.get(completion[i])){
        		map.put(completion[i], 1);
        	}else {
        		map.put(completion[i],map.get(completion[i])+1);
        	}
        }
        
        for(int i=0;i<participant.length;i++) {
        	if(map.get(participant[i])==null||map.get(participant[i])==0) {
        		answer = participant[i];
        		break;
        	}else{
        		map.put(participant[i],map.get(participant[i])-1);
        	}
        }
        
        
        return answer;
    }
}



