package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExampleCollection {

	public static void main(String[] args) {
		
		Iterable<String> itr = Arrays.asList("Aarti","Golu","Papa","Mummy", "Ant");
//		for(String name: itr)
//		{
//			System.out.println(name);
//		}
//itr.forEach(System.out::println);
		Iterator<String> iter = itr.iterator();
		while(iter.hasNext())
		{
			String next =iter.next();
			if(next.startsWith("A"))
break;
		}
		iter.forEachRemaining(System.out::println);
		System.out.println("====================================================================/n/n");
		
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Aarti","Golu","Papa","Mummy", "Ant"));
		names.removeIf(name -> name.contains("a"));
		names.forEach(System.out::println);
		
	/*	names.add("laptop");
		names.add("good");
		names.forEach(System.out::println);*/
		
		
	}

	
	
	
	
}
