package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class InnerClassesAndNestedClasses {
	
	class InnerClass{
		private int j=0;
		
		public void add() {
			j+=1;
		}
		public void print() {
			System.out.println("Inner Class: "+j);
		}
	}
	
	static class NestedClass{
		// Inner is a class which can only be accessed via instance of the inner class
		private static int i=0;
		static List<Integer> list1 = new ArrayList<Integer>();
		
		static void iterator() {
			for(i=0;i<5;i++) {
				list1.add(i);
			}
		}
		
		static void display() {
			System.out.println("Nested Class :"+list1.toString());
		}
	}

	public static void main(String[] args) {
		
		InnerClassesAndNestedClasses innerClassAndNesterdClassObject = new InnerClassesAndNestedClasses();
		InnerClass innerClassObject = innerClassAndNesterdClassObject.new InnerClass();
		innerClassObject.add();
		innerClassObject.print();
		NestedClass.iterator();
		NestedClass.display();
	}

}
