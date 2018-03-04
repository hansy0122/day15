package day15.Stream;

import java.util.Arrays;
import java.util.*;

public class MapAndReduceExample {
	public static void main(String ar[]){
		List<Student> studentList=Arrays.asList(new Student("A",10),new Student("B",20),new Student("C",30));
		double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();
		                                 //중간처리 학생 객체를 점수로 맵핑          //최종처리 평균 점수.
	}
}

/*class Student{
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
}*/