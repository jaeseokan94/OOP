package OOP;
// I buy from fruit seller

 class FruitBuyer{
	
	int Apple=10;
	int myMoney = 5000;
	
	public void buyApple(FruitSeller someone, int money){
		Apple =- someone.saleApple(money);

		myMoney =- money;
		
	}
	 
	 
}


 class OOP2 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		FruitSeller someone = new FruitSeller();
		FruitBuyer me = new FruitBuyer();
		
		me.buyApple(someone, 2000);
		someone.showResult();
		
		FruitSeller constructorToInitialize = new FruitSeller();
		constructorToInitialize.showResult();
		
	}

}

 class FruitSeller{

	 final int applePrice = 1000; 
	 
	 private int numOfApple ; 
	 private int sellerMoney ;
	 	 
	 
	 public FruitSeller(){
		numOfApple = 50;
		sellerMoney = 50000;
	 }
	 
	 public int saleApple(int money){
		 numOfApple -= money/applePrice;	 
		 sellerMoney += money;
		 
	return sellerMoney; }
	 
	 public void showResult(){
		 System.out.println(sellerMoney+ " is the amount of money fruitSeller have now");
		 System.out.println(numOfApple+ " is the number of apple left on a fruit seller side");
	 }
	 

 
 }