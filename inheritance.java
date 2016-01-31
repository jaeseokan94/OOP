package OOP;

class car{
	int casolineGauge;
	
	public car(int oil){
		casolineGauge = oil ;
		
	}
}

class HybridCar extends car{
	
	int electricGauge;
	
	public HybridCar(int oil, int elec) {
		super(oil);
		electricGauge = elec;
	}

}

class HybridWaterCar extends HybridCar{
	
	int waterGauge;

	
public HybridWaterCar(int oil, int elec, int water) {
		super(oil, elec);
		waterGauge = water;
		
	}


public void showCurrentGauge(){
	
	System.out.println("잔여 가솔린 : "+ casolineGauge);
	System.out.println("잔여 전기 : "+ electricGauge);
	System.out.println("잔여 물  : "+ waterGauge);

	
}

}

public class inheritance {

	public static void main(String[] args) {
		
		for(String e : args){
			System.out.println(e);
		}
		
		HybridWaterCar myCar = new HybridWaterCar(12,15 ,1 );
		myCar.showCurrentGauge();

	}

}