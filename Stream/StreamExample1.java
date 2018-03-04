package day15.Stream;
import java.util.*;

public class StreamExample1 {
	public static void main(String ar[]){
		List<String> list =Arrays.asList("This is java book", "Lambda Expressions", "Java8 Supports lambda expression");
		list.stream().filter(s->s.toLowerCase().contains("java")).forEach(a->System.out.println(a));
		
	}
}
