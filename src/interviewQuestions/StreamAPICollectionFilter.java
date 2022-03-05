package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPICollectionFilter {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.addAll(Arrays.asList(1,2,3,4,5));
		// Sequential stream
		Stream<Integer> sequntialStream = list.stream();
		// Parallel stream
		Stream<Integer> parallelStream = list.parallelStream();

		Stream<Integer> maxSequenceFilter = sequntialStream.filter(s -> s > 90);
		Stream<Integer> maxSequenceFilterParallel = parallelStream.filter(p -> p > 80);

		maxSequenceFilter.forEach(maxSequence -> System.out.println("Sequence Execution: " + maxSequence));
		maxSequenceFilterParallel.forEach(maxParallel -> System.out.println("Parallel Execution: " + maxParallel));
		
		List<Integer> seqList = sequntialStream.filter(p->p!=0).collect(Collectors.toList());
		seqList.forEach(System.out::println);


	}

}
