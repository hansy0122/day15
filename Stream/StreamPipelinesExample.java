package day15.Stream;
import java.util.*;

public class StreamPipelinesExample {
	public static void main(String ar[]){
		List<Member> list= Arrays.asList(
				new Member("A",Member.FEMALE,30),new Member("B",Member.MALE,15),new Member("C",Member.FEMALE,48),
				new Member("D",Member.MALE,17),new Member("E",Member.MALE,8));
		
		double ageAvg=list.stream().filter(m->m.getSex()==Member.MALE).mapToInt(m->m.getAge()).average().getAsDouble();
		System.out.println("남자평균나이="+ageAvg);
		
	}
}

class Member{
	public static int MALE=0;
	public static int FEMALE=1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
	
	
}