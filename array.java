package OOP;

import java.util.Scanner;

public class array {

	private static Scanner sc;
	

	private static int minValue(int[] array){
	
	int min =array[0]; 
	
	for(int i = 0 ; i<array.length; i ++){
		int tmp = array[i];
		
		if(min<array[i]){
			
		} else{ min = tmp;	}
	}
		return min;
	}

	
	
	public static void main(String[] args) {
	 
		int arr[] = new int[10];
		
		sc = new Scanner(System.in);
		
		for(int i = 0 ; i < arr.length ; i++ ){
		arr[i]=	sc.nextInt();

		}
		
		
		System.out.println(minValue(arr));

	}
}