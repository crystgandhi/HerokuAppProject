package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramStream2 {

	public static void main(String[] args) {
		//call the methods
		functional();
		System.out.println("----------------------------");
		functional2();
		System.out.println("----------------------------");
		printEven();
		System.out.println("----------------------------");
		printOdd();
	}

	public static void print(int number) {
		System.out.println(number);
	}
   //Use a stream to iterate through the numbers and print them using the custom 'print' method
	public static void functional() {
		List<Integer> numbers = Arrays.asList(17, 8, 9, 5, 4, 23, 1);
		numbers.stream().forEach(FunctionalProgramStream2::print);
	}
	// Use a stream to iterate through the numbers and print them directly using System.out::println
	public static void functional2() {
		List<Integer> numbers = Arrays.asList(17, 8, 9, 5, 4, 23, 1);
		numbers.stream().forEach(System.out::println);
	}
	// Use a stream to filter Even numbers
	public static void printEven() {
		List<Integer> numbers = Arrays.asList(17, 8, 9, 5, 4, 23, 1);
		numbers.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
	}
	// Use a stream to filter odd numbers 
	public static void printOdd() {
		List<Integer> numbers = Arrays.asList(17, 8, 9, 5, 4, 23, 1);
		numbers.stream()
		.filter(n->n%2==1)
		.forEach(System.out::println);
	}

}
