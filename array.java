package OOP;

import java.util.Scanner;

public class array {

	private static Scanner sc;
	
	private static int minValue(int[] array){
	
	int min = array[0]; 
	
	for(int i = 0 ; i<array.length; i ++){
		int tmp = array[i];
		
		if(min<array[i]){
			
		} else{ min = tmp;	}
	}
		return min;
	}

private static void transform (int[][] array2){
	int[] row = array2[array2.length-1];
	
	for(int i = array2.length-1; i==1; i --){
		for(int j = 0 ;  j < array2.length-1; j ++){
			System.out.print(array2[i][j]+" ");

		}		System.out.println("");

	}
	
	array2[0] = row ;
	
	}
	
private static void show(int[][] array2){
	for(int i = 0 ; i < array2.length; i++){for(int j = 0 ; j < array2.length; j++){	

		System.out.print(array2[i][j]+" ");
	}
	System.out.println(" ");
	}
	
}


	public static void main(String[] args) {
	 
		
		
		System.out.println("Input Integer 1 or 2 to get a minimum integer from array of 9 integers ");
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==1){ 
		System.out.println("Input 9 integers");
		int arr[] = new int[9];
		for(int i = 0 ; i < Math.sqrt(arr.length)*3 ; i++ ){
		arr[i]=	sc.nextInt();

		}
 
		System.out.println(minValue(arr));
}
		else if(a==2){
			System.out.println("Input 9 integers");
			int arr[] = new int[9];
			for(int e : arr){
			arr[e]=	sc.nextInt();

			}
			System.out.println(minValue(arr));
		}
		else{
			int array2[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
			};
			
			transform(array2);
			//transform(array2);
			show(array2);
			
		}
		
		
		

	}
}