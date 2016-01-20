package OOP;

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
	}

}

 class FruitSeller{

	 final int applePrice = 1000; 
	 
	 int numOfApple = 20 ; 
	 int numOfOrange = 10 ;
	 int sellerMoney = 50000 ;
	 
	 public int saleApple(int money){
		 numOfApple -= money/applePrice;	 
		 sellerMoney += money;
		 
	return sellerMoney; }
	 
	 public void showResult(){
		 System.out.println(sellerMoney+ " is the amount of money fruitSeller have now");
		 System.out.println(numOfApple+ " is the number of apple left on a fruit seller side");
	 }
	 

 
 }