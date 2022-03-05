package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Java8FeaturesAndExamples {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(1,2,3,4,6));
		
		//stream defines sequence
		list1.stream().forEach(i -> System.out.println("Stream "+ i));
		//parallelStream may not be sequential
		list1.parallelStream().forEach(i -> System.out.println("parallelStream "+ i));
		
		/*
		 * Intermediate Operations:
		 */
		//Map function for stream
		list1.stream().map(x -> x+1).collect(Collectors.toList()).forEach(i -> System.out.println("Map function Increasing x values with 1 "+i));;
		
		//Filer Function for Stream
		list1.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(i -> System.out.println("Filter Function for even numbers "+ i));
		
		//Sort Function for Stream
		list1.stream().sorted().collect(Collectors.toList()).forEach(i -> System.out.println("Sort Function for even numbers "+ i));
		
		/*
		 * Terminal Operations:
		 */
		
		//Collect
		list1.stream().map(x -> x+1).collect(Collectors.toList()).forEach(i -> System.out.println("Collect function Increasing x values with 1 and collecting in the list"+i));;
		
		//forEach
		list1.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(i -> System.out.println("for each Function for even numbers "+ i));
		
		//reduce
		int even = list1.stream().filter(x->x%2==0).reduce(0, (ans,i)->ans+i);
		System.out.println("reducer function " +even);
		
		
	}
	
	
	

}
