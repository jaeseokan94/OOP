package OOP;

import java.util.Scanner;

public class timeConverter {
// 07:30:24pm -> 19:30:24

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        String time = in.next();
        String hour2 = time.split("\\:")[0];
        int hour = Integer.parseInt(hour2);

        String minute = time.split("\\:")[1];
       
        String last = time.split("\\:")[2];
        char second = last.charAt(0);
        char second2 = last.charAt(1);

       
        char ampm1 = last.charAt(2);


       
       
        if(ampm1 == 'a'){
    	   System.out.println(hour+":"+minute+":"+second+second2);
       } else if(ampm1=='p'&& hour == 01 ){
    	   System.out.println(13+":"+minute+":"+second+second2);

       } else if(ampm1=='p'&& hour == 2 ){
    	   System.out.println(14+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 3 ){
    	   System.out.println(15+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 4 ){
    	   System.out.println(16+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 5 ){
    	   System.out.println(17+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 6 ){
    	   System.out.println(18+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 07 ){
    	   System.out.println(19+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 8 ){
    	   System.out.println(20+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 9 ){
    	   System.out.println(21+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 10 ){
    	   System.out.println(22+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 11 ){
    	   System.out.println(23+":"+minute+":"+second+second2);

       }else if(ampm1=='p'&& hour == 12 ){
    	   System.out.println(24+":"+minute+":"+second+second2);

       }else {
    	   System.out.println(hour);
       }
    } 
}

