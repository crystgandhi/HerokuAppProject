package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class FindSquareAndSum {
	
	public static void main(String[] args) {
		int resultSquare=findSquareAndSums();
		System.out.println(resultSquare);
		
		int resultCube=findCubeAndSums();
		System.out.println(resultCube);
		
		int resultOdd=findOddAndSums();
		System.out.println(resultOdd);
	}
	private static Integer findSquareAndSums() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		return numbers.stream().map(n->n*n).reduce(0,(x,y)->x+y);
	}

	private static Integer findCubeAndSums() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		return numbers.stream().map(n->n*n*n).reduce(0,(x,y)->x+y);
	}
	
	private static Integer findOddAndSums() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		return numbers.stream().filter(n->n%2==1).reduce(0,(x,y)->x+y);
	}
	
	
}