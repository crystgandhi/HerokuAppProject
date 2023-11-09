package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaExpressionAndFilters {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>(Arrays.asList("Paris", "New York", "London"));
		cities.stream().forEach(System.out::println);
		cities.stream().forEach(n->System.out.println(n));
		cities.stream().filter(n->n.contains("k")).forEach(System.out::println);
		cities.stream().filter(n->n.length()>6).forEach(n->System.out.println(n));
		cities.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		cities.stream().map(String::toUpperCase).forEach(n->System.out.println(n));
		cities.stream().map(n->n+"-"+n.length()).forEach(System.out::println);
		
	}

}
