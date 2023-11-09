package FunctionalProgrammingLambdaExpressions.LambdaExpressions;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		System.out.println(Stream.of(76,98,45,63,23,12).count());
		int[] numArray= {76,98,45,63,23,12};
		OptionalDouble ave=Arrays.stream(numArray).average();
		System.out.println(ave);
		int howmany=(int) Arrays.stream(numArray).count();
		System.out.println(howmany);
		System.out.println("Max : "+Arrays.stream(numArray).max());
		System.out.println("Min : "+Arrays.stream(numArray).min());
		System.out.println("Sum : "+Arrays.stream(numArray).sum());
		
	}

}
