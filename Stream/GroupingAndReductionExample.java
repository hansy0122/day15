package day15.Stream;
import java.util.*;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
	public static void main(String ar[]){
		List<Student_E> totalList =Arrays.asList(new Student_E("A",10,Student_E.Sex.MALE),
				new Student_E("B",6,Student_E.Sex.MALE),new Student_E("C",18,Student_E.Sex.FEMALE),
				new Student_E("D",9,Student_E.Sex.FEMALE));
		
		// key:sex  value: avg
		Map<Student_E.Sex, Double> mapBySex =totalList.stream().
				collect(Collectors.groupingBy(Student_E::getSex, Collectors.averagingDouble(Student_E::getScore)));
		System.out.println("average of male="+mapBySex.get(Student_E.Sex.MALE));
		System.out.println("average of female="+mapBySex.get(Student_E.Sex.FEMALE));
		
		// key: sex value: String(name, name, name)
		Map<Student_E.Sex,String> mapByName = totalList.stream().collect(
				Collectors.groupingByConcurrent(Student_E::getSex, Collectors.mapping(Student_E::getName, Collectors.joining(","))));
		
		System.out.println("name of male="+ mapByName.get(Student_E.Sex.MALE));
		System.out.println("name of female="+ mapByName.get(Student_E.Sex.FEMALE));
	}
}


class Student_E{
	public enum Sex {MALE,FEMALE}
	public enum City{Seoul,pusan}
	
	private String name;
	private int score;
	private Sex sex;
	private City city;
	public Student_E(String n,int s,Sex sex){
		this.name=n;
		this.score=s;
		this.sex=sex;
	}
	public Student_E(String n,int s,Sex sex,City city){
		this.name=n;
		this.score=s;
		this.sex=sex;
		this.city=city;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}