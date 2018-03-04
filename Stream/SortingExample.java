package day15.Stream;

import java.util.*;
import java.util.stream.*;

public class SortingExample {
	public static void main(String ar[]){
		//箭磊 夸家老版快
		IntStream intStream=Arrays.stream(new int[]{5,4,3,2,1});
		intStream.sorted().forEach(n->System.out.println(n));
		System.out.println();
		
		intStream=Arrays.stream(new int[]{5,4,3,2,1});
		intStream.boxed().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		System.out.println();
		//按眉 夸家老 版快
		List<Student> studentList=Arrays.asList(new Student("A",20),new Student("B",10),new Student("C",30));
		studentList.stream().sorted((a,b)->{ return Integer.compare(a.getScore(), b.getScore());}).forEach(s->System.out.println(s.getScore()));
		System.out.println();
		studentList=Arrays.asList(new Student("A",20),new Student("B",10),new Student("C",30));
		studentList.stream().sorted((a,b)->{ return -1*Integer.compare(a.getScore(), b.getScore());}).forEach(s->System.out.println(s.getScore()));
		
	}
}

