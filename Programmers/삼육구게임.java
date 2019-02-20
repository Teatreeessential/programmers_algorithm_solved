package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class ªÔ¿∞±∏∞‘¿” {
	
	public static void main(String[] argv) {
		 for(int i=1;i<=10000;i++) {
			 int count = clap(i);
			 
			 System.out.print(i +":");
			 for(int j=0;j<count;j++) {
				 System.out.printf("¬¶");
			 }
			 System.out.println();
		 }
		
	}
	
	public static int clap(int number) {
		int len =  String.valueOf(number).length();
		int count = 0;
		
		for(int i = len-1;i>=0;i--) {
			int a =(int)(number/Math.pow(10,i));
			if(a%3==0) {
				count++;
			}
			number -= a*Math.pow(10, i);
			if(number==0) break;
		}
		
		return count;
	}

}


