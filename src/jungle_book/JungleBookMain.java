package jungle_book;

public class JungleBookMain {
	public static void main(String[] args) {
		Dog Tommy =new Dog();
		Tommy.Name="Tommy";
		Tommy.age="10";
		Tommy.run();
		Tommy.run(4);
		Tommy.run("Mr.",4);
		Tommy.run(5,"Mr.");
		Tommy.colour="White";
		Tommy.bark();
		System.out.println("\n\n");
		
		Snake kaa=new Snake();
		kaa.Name="kaa";
		kaa.colour="black";
		kaa.bite();
		kaa.Walk();
		
		System.out.println("\n\n");
		Human sunil =new Human();
		sunil.Name="sunil";
		sunil.run(4);
		sunil.Talk();
		sunil.Eat();
		System.out.println("\n\n");
		
		
		
		
		
		
		
		
		
	}

}
