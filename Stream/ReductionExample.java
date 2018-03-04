package day15.Stream;
import java.util.*;
	
public class ReductionExample {
	public static void main(String ar[]){
		List<Student_R> studentList=Arrays.asList(new Student_R("A",92),new Student_R("B",95),new Student_R("C",88));
		int sum1=studentList.stream().mapToInt(Student_R::getScore).sum();
		System.out.println(sum1);
		
		int sum2=studentList.stream().mapToInt(Student_R::getScore).reduce((a,b)->{return a+b;}).getAsInt();
		System.out.println(sum2);
		
		int sum3=studentList.stream().mapToInt(Student_R::getScore).reduce(0,(a,b)->a+b);
		System.out.println(sum3);
	}
}

class Student_R{
	private String name;
	private int score;
	
	public Student_R(String n,int s){
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