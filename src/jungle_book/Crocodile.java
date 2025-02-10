package jungle_book;

public class Crocodile extends Animal{

	public void hunt() {
		System.out.println(Name+" is hunting");
		
	}
	@Override
	public void Walk() {
		System.out.println(Name+" is high walking");
		
	}
	public void Swim() {
		System.out.println(Name+" is Swiming");
		
	}//overload	
	public void Swim(int duration) {
		System.out.println(Name+" is Swiming scince"+duration);
		
	}
}
