package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateListOfEcenNUmbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(61, 24, 73, 49, 95, 24, 17, 88, 49, 34);
		List<Integer> result = numbers.stream().distinct().sorted().filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}