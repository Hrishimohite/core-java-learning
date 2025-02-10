package jungle_book;

public class Dog extends Animal{
	int nails;
	String Breed;
//	public void Drink()  Inheritance method
	@Override //Annotation =>Tag
	public void Drink() {
		System.out.println(Name+" is Lapping");	
	}
	public void run() {
		System.out.println(Name+" is running");	
	}
	//overload
	public void run(int duration) {
		System.out.println(Name+" is running since "+duration+" hours");	
	}
	//overload
	public void run(String alias,int duration) {
		System.out.println(alias+Name+" is running since "+duration+" hours");	
	}
	//overload
	public void run( int duration,String alias) {
		System.out.println(alias+Name+" is running since "+duration+" hours");	
	}
	public void bark( ) {
		System.out.println(Name+" is barking  ");	
	}

}
