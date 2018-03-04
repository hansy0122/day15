package day15.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class ToListExample {
	public static void main(String ar[]){
			List<Student_H> totalList =Arrays.asList(new Student_H("A",10,Student_H.Sex.MALE),
					new Student_H("B",6,Student_H.Sex.MALE),new Student_H("C",18,Student_H.Sex.FEMALE),
					new Student_H("D",9,Student_H.Sex.FEMALE));
			
			//only MALE ->List
			List<Student_H> maleList =totalList.stream().filter(s->s.getSex()==Student_H.Sex.MALE).collect(Collectors.toList());
			maleList.stream().forEach(s->System.out.println(s.getName()));
			System.out.println();
			
			//only FEMALE ->HashSet
			Set<Student_H> femaleSet=totalList.stream().filter(s->s.getSex()==Student_H.Sex.FEMALE).collect(Collectors.toCollection(HashSet::new));
			femaleSet.stream().forEach(s->System.out.println(s.getName()));
	}
}


class Student_H{
	public enum Sex {MALE,FEMALE}
	public enum City{Seoul,pusan}
	
	private String name;
	private int score;
	private Sex sex;
	private City city;
	public Student_H(String n,int s,Sex sex){
		this.name=n;
		this.score=s;
		this.sex=sex;
	}
	public Student_H(String n,int s,Sex sex,City city){
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