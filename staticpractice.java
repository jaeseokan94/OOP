package OOP;


class SimpleNumber{
	
	int num = 0 ;
	private SimpleNumber(){}
	public void addNumb(int n){num+=n;}
	public void showNumb(){System.out.println(num);}
	
	private static SimpleNumber inst = null;
	public static SimpleNumber getSimpleNumberInst(){
		
		if(inst==null)
			inst = new SimpleNumber();
		
		
		return inst;
	}
}


public class staticpractice {

	public static void main(String[] args) {
		
		SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
		num1.addNumb(20);

		SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
		num2.addNumb(30);
		
		num1.showNumb();
		num2.showNumb();

	}

}