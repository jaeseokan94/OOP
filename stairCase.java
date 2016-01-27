package OOP;

public class stairCase {

	

    static void StairCase(int n) {
        String repeated = new String(new char[n]).replace("\0", "#");
             StringBuilder sb = new StringBuilder(repeated);   
        for(int i = 1 ; i <= n ; i ++ ){
                  sb.insert(i, " ");
                 System.out.println(sb);
}
        
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner in = new Scanner(System.in);
	        int _n;
	        _n = Integer.parseInt(in.nextLine().trim());
	        
	        StairCase(_n);
	        
	    }
	
	}

}
