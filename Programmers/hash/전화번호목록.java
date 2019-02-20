package Programmers.hash;

import java.util.Arrays;

public class 전화번호목록 {
	 public boolean solution(String[] phoneBook) {
	        boolean result = true;
	        for(int i=0;i<phoneBook.length-1;i++) {
	        	for(int j=i+1;j<phoneBook.length;j++) {
	        		if(phoneBook[j].startsWith(phoneBook[i])) return false;
	        		if(phoneBook[i].startsWith(phoneBook[j])) return false;
	        	}
	        }
	        
	        return result;
	  }
	
}
