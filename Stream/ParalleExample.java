package day15.Stream;
import java.util.*;
import java.util.stream.*;

public class ParalleExample {
	public static void main(String ar[]){
		List<String> list =Arrays.asList("A","B","C","D","E","F");
		
		//순차처리
		Stream<String> stream=list.stream();
		stream.forEach(ParalleExample::print);
		System.out.println();
		
		//병렬처리
		Stream<String> paralleStream=list.parallelStream();
		paralleStream.forEach(ParalleExample::print);
		
	
	}
	public static void print(String str){
		System.out.println(str+" : "+ Thread.currentThread().getName());
	}
}
