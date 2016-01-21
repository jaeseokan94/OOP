package OOP;

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


	}

}