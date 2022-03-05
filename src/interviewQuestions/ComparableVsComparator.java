package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator implements Comparable<ComparableVsComparator>{
	
	private int age;
	private String name;
	public ComparableVsComparator(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "["+ "Age: "+age + " "+"Name: "+name +"]";
	}
	public static void main(String[] args) {
		ComparableVsComparator[] comparableVsComparatorsObjects = new ComparableVsComparator[3];
		comparableVsComparatorsObjects[0] = new ComparableVsComparator(25, "chiru");
		comparableVsComparatorsObjects[1] = new ComparableVsComparator(35, "Keerthi");
		comparableVsComparatorsObjects[2] = new ComparableVsComparator(39, "Arjun");
		/*//System.out.println(comparableVsComparatorsObjects.toString());
		comparableVsComparatorsObjects.forEach(object->System.out.println(object.age+" "+object.name));
		comparableVsComparatorsObjects.forEach(a->a.compareTo(a));
		comparableVsComparatorsObjects.forEach(object->System.out.println(object.age+" "+object.name));*/
		/*for(ComparableVsComparator comparableVsComparator:comparableVsComparatorsObjects) {
			comparableVsComparator.compareTo(comparableVsComparator);
		}*/
		Arrays.sort(comparableVsComparatorsObjects);
		System.out.println("Default Sorting of the Comparable Interface: "+Arrays.toString(comparableVsComparatorsObjects));
	}
	/*@Override
	public int compare(ComparableVsComparator o1, ComparableVsComparator o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(ComparableVsComparator o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}*/
	@Override
	public int compareTo(ComparableVsComparator o) {
		// TODO Auto-generated method stub
		return (this.age - o.age);
	}

}
