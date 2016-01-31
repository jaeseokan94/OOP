package OOP;

import java.util.Scanner;
import java.util.StringTokenizer;

public class timeConverter {
// 07:30:24pm -> 19:30:24

    public static void main(String[] args) {
    	
    	String time = "11:43:00a";
    	
    	StringTokenizer st = new StringTokenizer(time,":");
    	
    	while(st.hasMoreTokens())
    		System.out.println(st.nextToken());
       
    } 
}



/*  String time = in.next();
  String hour2 = time.split("\\:")[0];
  int hour = Integer.parseInt(hour2);

  String minute = time.split("\\:")[1];
 
  String last = time.split("\\:")[2];
  char second = last.charAt(0);
  char second2 = last.charAt(1);

 
  char ampm1 = last.charAt(2);
*/
