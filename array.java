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
/*
private static int[][] transform (int[][] array){
		
	for(int i = 0 ; i < 3 ; i++)for(int j = 0 ; j < 3 ; j ++){
	if(i==1&&i==0){
		i=i+1;
	}else if (i==2){
		i = 0;
	}
	}		
	
	for(int i = 0 ; i < 3 ; i++)for(int j = 0 ; j < 3 ; j ++){

	System.out.println(array);}
		return array;
	}
	*/
	public static void main(String[] args) {
	 
		
		
		
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==1){
		
		int arr[] = new int[9];
		for(int i = 0 ; i < Math.sqrt(arr.length)*3 ; i++ ){
		arr[i]=	sc.nextInt();

		}
 
		System.out.println(minValue(arr));
}
		else if(a==2){
			
			int arr[] = new int[9];
			for(int e : arr){
			arr[e]=	sc.nextInt();

			}
			System.out.println(minValue(arr));
		}
		else{
			int arr[][] = new int[3][3];
			for(int i = 0 ; i < 3 ; i++)for(int j = 0 ; j < 3 ; j ++){
			arr[i][j] = sc.nextInt();
			}
			System.out.println(arr+"");
		}
		
		
		

	}
}