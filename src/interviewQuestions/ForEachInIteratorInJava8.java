package interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachInIteratorInJava8 {

	public static void main(String[] args) {

		List<Object> myList = new ArrayList<Object>();

		for (int i = 0; i < 10; i++)
			myList.add(i);
		Iterator<Object> it = myList.iterator();
		// using Anonymous Class
		myList.forEach(new Consumer<Object>() {
			public void accept(Object t) {
				System.out.println("Anonymous class " + t);
			}
		});

		// Using lamda Expressions
		myList.forEach(myList1 -> System.out.println("Using lamda Expressions : " + myList1));
		

	}
}
