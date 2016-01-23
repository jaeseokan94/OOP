package OOP;

import java.util.Scanner;

public class stringbuilder {

	
	public static void main(String[] args) {
		String str = "940520-1234563";

		StringBuilder strb = new StringBuilder(str);
		
		for(int i=0;i<strb.length();i++){
			 
			if(strb.charAt(i)=='-'){
				strb.deleteCharAt(i);
				break;
			} else{
				
			}
		}
		str=strb.toString();
		System.out.println(str);
		
		
		
		System.out.printf("\"hello\" \n hi %d " ,50 );

		String source = "1 5 7 ";
		Scanner sc = new Scanner(source);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a+b+c;

		System.out.printf("\n%d+%d+%d=%d",a,b,c,sum);

	}

}
//cd documents/workspace/projectsiliconvalley/src/oop
