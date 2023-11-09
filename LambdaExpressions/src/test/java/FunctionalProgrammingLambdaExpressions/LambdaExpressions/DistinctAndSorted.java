package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DistinctAndSorted {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(61, 24, 73, 49, 95, 24, 17, 88, 49, 34);
		numbers.stream().distinct().sorted().forEach(System.out::println);
		numbers.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("-------------");
		
		List<String> names = Arrays.asList("David","Kathy" ,"Alice", "Eve", "Charlie", "Bob","Kathy" );
		names.stream().distinct().sorted().forEach(System.out::println);
		names.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		names.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		names.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
	}

}
