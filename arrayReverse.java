package OOP;

import java.util.Scanner;


public class arrayReverse {

    static void shift(int[] arr, int n){
        int arr2[] = new int[n];
           for(int i =  n-1 ; i>=0 ; i--){
              
                   arr2[i]=arr[n-i-1];      
               
               System.out.print(arr2[i]+" ");

           }
    }
    
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
          
        int arr[] = new int[n];
        
        for(int i = n-1 ; i >= 0 ; i --){
           int tmp= in.nextInt();
            arr[i] = tmp;



        }
        shift(arr,n);
    }
}

