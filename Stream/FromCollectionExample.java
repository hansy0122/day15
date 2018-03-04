package day15.Stream;
import java.util.*;
import java.util.stream.Stream;


public class FromCollectionExample {
	public static void main(String ar[]){
		List<Student> studentList=Arrays.asList(new Student("A",10),new Student("B",20),new Student("C",30));
		Stream<Student> stream=studentList.stream();
		stream.forEach(s->System.out.println(s.getName()));
	}
}
