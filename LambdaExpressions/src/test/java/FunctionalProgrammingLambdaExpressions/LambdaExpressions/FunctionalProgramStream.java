package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramStream {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(17, 8,9, 5, 4,23);
		System.out.println(numbers.toString());
		numbers.stream().forEach(n->System.out.println(n));

	}

}
