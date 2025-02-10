package array_learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionFramework {
	public static void main(String[] args) {
//		collection framework
//		List 
//		ArryList-duplicate value allow
		ArrayList<String> Al=new ArrayList<>();
		Al.add("vaibhav");
		Al.add("hrisikesh");
		Al.add("sahil");
		Al.add("omkar");
		Al.add("digant");
		Al.add("mahesh");
		Al.add("mahesh");
		Al.add("vaibhav");
		
		for (String name:Al) {
			System.out.println(name);
			
		}
//		list
//		LinkedList -Duplicate value allow
		System.out.println("\n");
		LinkedList<String> Ll=new LinkedList<>();
		Ll.add("vaibhav");
		Ll.add("hrisikesh");
		Ll.add("sahil");
		Ll.add("omkar");
		Ll.add("digant");
		Ll.add("mahesh");
		Ll.add("mahesh");
		Ll.add("vaibhav");
		
		for (String name:Ll) {
			System.out.println(name);
			
		}
//		set- unique value
//		HashSet-unique+random order maintain
		System.out.println("\n");
		HashSet<String> Hs=new HashSet<>();
		Hs.add("vaibhav");
		Hs.add("hrisikesh");
		Hs.add("sahil");
		Hs.add("omkar");
		Hs.add("digant");
		Hs.add("mahesh");
		Hs.add("mahesh");
		Hs.add("vaibhav");
		
		for (String name:Hs) {
			System.out.println(name);
			
		}
//		LinkedHashSet
//		unique + insertion order maintain
		System.out.println("\n");
		LinkedHashSet<String> Lhs=new LinkedHashSet<>();
		Lhs.add("vaibhav");
		Lhs.add("hrisikesh");
		Lhs.add("sahil");
		Lhs.add("omkar");
		Lhs.add("digant");
		Lhs.add("mahesh");
		Lhs.add("mahesh");
		Lhs.add("vaibhav");
		
		for (String name:Lhs) {
			System.out.println(name);
			
		}
//		TreeSet =unique +sorted order
		System.out.println("\n");
		TreeSet<String> Ts=new TreeSet<>();
		Ts.add("vaibhav");
		Ts.add("hrisikesh");
		Ts.add("sahil");
		Ts.add("omkar");
		Ts.add("digant");
		Ts.add("mahesh");
		Ts.add("mahesh");
		Ts.add("vaibhav");
		
		for (String name:Ts) {
			System.out.println(name);
			
		}
		
	}

}
