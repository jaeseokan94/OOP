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

private static void transform (int[][] array2){
	
	int lastLow[] = array2[array2.length-1];
	
	for(int low=array2.length-1; low>0;low--){
		array2[low] = array2[low-1]; 
	}
	array2[0] = lastLow;

		
	}
	
private static void show(int[][] array2){
	for(int i = 0 ; i < array2.length; i++){for(int j = 0 ; j < array2.length; j++){	

		System.out.print(array2[i][j]+" ");

	}
	System.out.println(" ");
	}
	
}


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
			int array2[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
			};
			
			transform(array2);
			show(array2);
			
		}
		
		
		

	}
}