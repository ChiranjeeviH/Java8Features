package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class CustomImmutableClass {

	/*
	 * 1) Mark class as final to not allow to get inherited
	 * 
	 * 2) Mark all the fields are private so that direct access is not possible
	 * outside
	 * 
	 * 3) don't provide setter methods so that others can't access via object
	 * 
	 * 4) Mark all the mutable fields as final so that value can be assigned once.
	 * 
	 * 5) Initialize all fields via a constructor performing deep copy
	 * 
	 * 6) Performing cloning the objects in getter methods to return a copy rather
	 * than returning actual
	 * 
	 */

	private final int id;

	private final String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}

	private final ArrayList<String> list1;

	@SuppressWarnings("unchecked")
	public ArrayList<String> getList1() {
		return (ArrayList<String>) list1.clone();
	}

	private HashMap<String, String> testMap;

	public CustomImmutableClass(int i, String n, HashMap<String, String> hm, List<String> l) {
		this.id = i;
		this.name = n;
		this.testMap = hm;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		ArrayList<String> tempList = new ArrayList<String>();
		
		hm.forEach((a,b) -> tempMap.put(a, b));

//		String key;
//		Iterator iterator = hm.keySet().iterator();
//
//		while (iterator.hasNext()) {
//			key = (String) iterator.next();
//			tempMap.put(key, hm.get(key));
//		}
		this.testMap = tempMap;
		
		//List population
		
		l.forEach(a -> tempList.add(a));
		this.list1 = tempList;
	}

	public static void main(String[] args) {

		HashMap<String, String> implementedHashMap = new HashMap<String, String>();
		implementedHashMap.put("name", "chiru");
		implementedHashMap.put("unit", "FSSTAR");
		implementedHashMap.put("role", "SSE");
		implementedHashMap.put("name", "chiranjeevi");
		int i = 725062;

		String s = "Chiranjeevi";

		CustomImmutableClass ce = new CustomImmutableClass(i, s, implementedHashMap, Arrays.asList("1"));

//		System.out.println(implementedHashMap.hashCode());
//		System.out.println(ce.hashCode());

		// Lets see whether its copy by field or reference
		System.out.println(s == ce.getName());
		System.out.println(implementedHashMap == ce.getTestMap());
		// print the ce values
		System.out.println("ce id:" + ce.getId());
		System.out.println("ce name:" + ce.getName());
		System.out.println("ce testMap:" + ce.getTestMap());
		System.out.println("List values " + ce.getList1().toString());
		// change the local variable values

		ce.getTestMap().put("name", "hari");
		implementedHashMap.put("Grade", "2");
		ce.getList1().add("2");
		// print the values again
		System.out.println("ce testMap after local variable change:" + ce.getTestMap());
		System.out.println("ce list post local change " + ce.getList1().toString());

		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");

		System.out.println("ce testMap after changing variable from accessor methods:" + ce.getTestMap());
	}

}
