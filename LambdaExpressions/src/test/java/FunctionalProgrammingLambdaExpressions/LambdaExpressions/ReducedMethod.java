package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class ReducedMethod {

	public static void main(String[] args) {
		int sum1=addNumbersFunctional1();
		System.out.println(sum1);
		
		int sum2=addNumbersFunctional2();
		System.out.println(sum2);
		
		int sum3=addNumbersFunctional3();
		System.out.println(sum3);
	}

	private static int addNumbers(int a, int b) {
		return a + b;
	}

	public static Integer addNumbersFunctional1() {
		List<Integer> numbers = Arrays.asList(61, 24, 73, 49, 95, 26, 17, 88, 9, 34);
		return numbers.stream().reduce(0, ReducedMethod::addNumbers);
	}
	
	public static Integer addNumbersFunctional2() {
		List<Integer> numbers = Arrays.asList(61, 24, 73, 49, 95, 26, 17, 88, 9, 34);
		return numbers.stream().reduce(0, (x,y)->x+y);
	}
	public static Integer addNumbersFunctional3() {
		List<Integer> numbers = Arrays.asList(61, 24, 73, 49, 95, 26, 17, 88, 9, 34);
		return numbers.stream().reduce(0, Integer::sum);
	}

}
