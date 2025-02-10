package jungle_book;

public class Human 	extends Animal{
	public void Study() {
		System.out.println(Name+" is Studying");
		
	}
	public void Talk() {
		System.out.println(Name+"is Talking");
		
	}
	//overload
		public void run(int duration) {
			System.out.println(Name+" is running since "+duration+" hours");	
		}
		

}
