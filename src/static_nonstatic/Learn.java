package static_nonstatic;

public class Learn extends Student{
	public static void main(String[] args) { //Static
		
		//1- Object create करून 
		//दुसऱ्याच्या वस्तु दुसऱ्याच्याच आहेत पण त्याच्या multiple copies
		Student std =new Student();
		System.out.println(std.firstName);
		Student std1 =new Student();
		System.out.println(std.firstName);
		
		//2-statically
		//दुसऱ्याच्या वस्तु दुसऱ्याच्याच आहेत पण Single copy
		System.out.println(Student.collegeName);
		
		//3-inheritance
		//दुसऱ्याचा माल आपला आहे अस वापरणे 
		System.out.println(collegeName);
	}
	
	public void timePass() {
		System.out.println(firstName);
		System.out.println(lastName);
	}

}
