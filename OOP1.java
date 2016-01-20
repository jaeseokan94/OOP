package OOP;
// change decimal number to binary number
public class OOP1 {


	 static int tenToTwo (int n){
		 if(n>0){
			 int tmp;
		    tmp = n%2;
		  n/=2;
		 tenToTwo(n);
		 System.out.print(tmp);}
		  
		return 0;
		 
	}
	 
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
	tenToTwo(5);
	}

}
