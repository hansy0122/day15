package day15.Stream;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class LambdaExpressionsExample{
	public static void main(String ar[]){
		List<Student> list=Arrays.asList(new Student("AAA",10), new Student("BBB",30), new Student("CCC",50));
		Stream<Student> stream =list.stream();
		stream.forEach(s->{
			String name=s.getName();
			int score=s.getScore();
			System.out.println(name+"--"+score);
		});
	}
}

class Student{
	private String name;
	private int score;
	
	public Student(String n,int s){
		this.name=n;
		this.score=s;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}