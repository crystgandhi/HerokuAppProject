package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class FindCubesOfOddNumbers {

	public static void main(String[] args) {
		findCubes();
	}

	public static void findCubes() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().filter(n->n%2==1).map(n->n*n*n).forEach(System.out::println);
	}
}
