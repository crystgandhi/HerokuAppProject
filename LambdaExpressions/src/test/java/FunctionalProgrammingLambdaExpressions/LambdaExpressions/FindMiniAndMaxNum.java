package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class FindMiniAndMaxNum {

	public static void main(String[] args) {

		int minNumber = findMinNum();
		System.out.println(minNumber);

		int maxNumber = findMaxNum();
		System.out.println(maxNumber);
	}

	public static Integer findMaxNum() {
		List<Integer> numbers = Arrays.asList(61, 24, 73, 49, 95, 26, 17, 88, 9, 34);
		return numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
	}

	public static Integer findMinNum() {
		List<Integer> numbers = Arrays.asList(61, 24, 73, 49, 95, 26, 17, 88, 9, 34);
		return numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
	}
}
