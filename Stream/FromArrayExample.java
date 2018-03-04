package day15.Stream;

import java.util.stream.*;
import java.util.*;

public class FromArrayExample {
	public static void main(String ar[]) {
		String[] strArray = { "A", "B", "C" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ","));
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
	}
}
