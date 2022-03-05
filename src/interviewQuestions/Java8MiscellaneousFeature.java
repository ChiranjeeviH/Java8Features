package interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Java8MiscellaneousFeature {
	
	private String name;
	
	private int age;
	
	public Java8MiscellaneousFeature(String empName, int empAge){
		this.name = empName;
		this.age = empAge;
	}
	
	public static void main(String[] args) {
		
		List<Java8MiscellaneousFeature> objects = Arrays.asList(new Java8MiscellaneousFeature("chiru", 26),
				new Java8MiscellaneousFeature("Arjun", 39), new Java8MiscellaneousFeature("Keerthi", 34));
		
	}

}
