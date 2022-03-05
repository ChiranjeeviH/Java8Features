package interviewQuestions;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionInterviewQuestions {
	
	public static void main(String[] args) {
		
		List<Object> list1 = new ArrayList<Object>();
		list1.add("Chiru");
		list1.add(1);
		list1.add("Chiru");
		list1.add(2.3);
		list1.add(2);
		list1.forEach(listDetails ->System.out.print(listDetails+","));
		
		System.out.println();
		
		Set<Object> set = list1.stream().collect(Collectors.toSet());
		set.forEach(setDetails ->System.out.print(setDetails+","));
		
		System.out.println();
		
		//Predicate<Object> pr = x -> x.equals(2);
		//Concurrent ModificationException
		try {
			for(Object x:list1) {
				if(x=="Chiru") {
					list1.remove(x);
				}
			}
		}
		catch(ConcurrentModificationException ex) {
			System.out.println("ConcurrentModification Exception araised to resolve that use iterator");
			new CollectionInterviewQuestions().iteratorCheck(list1);
		}
		catch(Exception e) {
			System.out.println("Exception occured "+e.getMessage());
		}
		
		list1.removeIf(x -> x=="Chiru");
		list1.forEach(listDetails ->System.out.print(listDetails+","));
		
		
	}
	
	public void iteratorCheck(List<Object> list1) {
		
		Iterator<Object> i = list1.iterator();
		
		while(i.hasNext()) {
			if(i.next() == (Object) 2.3) {
				i.remove();
			}
		}
		
		System.out.println(list1.toString());
		
		
	}

}
