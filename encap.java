package OOP;


class Java{
	public void learn(){
		System.out.println("Study OOP, Data Structure, Algorithm");
	}
}

class R{
	public void learn(){
		System.out.println("Study scripting language R or Python");
	}
}

class Data{
	public void learn(){
		System.out.println("Study stats, distributed system, database");
	}
}


class dataEngineer {
	
	public void learnJava(Java module){module.learn();}
	public void learnR(R module){module.learn();}
	public void learnData(Data module){module.learn();}
}

public class encap {

	public static void main(String[] args) {
		dataEngineer training = new dataEngineer();
		training.learnJava(new Java());
		training.learnR(new R());
		training.learnData(new Data());

	}

}
