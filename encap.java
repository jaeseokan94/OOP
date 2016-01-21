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

class DataEngineer {
	
	Java java;
	R r;
	Data data;
	
	public DataEngineer(){
		java = new Java();
		r = new R();
		data = new Data();
	}
	
	public void learn(){
		java.learn();
		r.learn();
		data.learn();
	}
}

class Student {
	public void learnDataEngineering(DataEngineer go){
		go.learn();
	};
}

public class encap {
	
	public static void main(String[] args) {
		Student jaeseok = new Student(); 
		jaeseok.learnDataEngineering(new DataEngineer());

	}

}