package jungle_book;

public class Snake extends Animal {
	public void hunt() {
		System.out.println(Name+" is hunting");
		
	}
	public void bite() {
		System.out.println(Name+" is biting");
		
	}
	@Override  
	public void Walk() {//own method
		System.out.println(Name+" is slithing");//definition change करणे 
		
	}

}
