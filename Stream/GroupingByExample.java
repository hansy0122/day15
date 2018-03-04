package day15.Stream;
import java.util.*;
import java.util.stream.Collectors;



public class GroupingByExample {
	public static void main(String ar[]){
				List<Student_G> totalList =Arrays.asList(new Student_G("A",10,Student_G.Sex.MALE,Student_G.City.Pusan),
						new Student_G("B",6,Student_G.Sex.MALE,Student_G.City.Pusan),new Student_G("C",18,Student_G.Sex.FEMALE,Student_G.City.Seoul),
						new Student_G("D",9,Student_G.Sex.FEMALE,Student_G.City.Seoul));
				
				Map<Student_G.Sex, List<Student_G>> mapBySex =totalList.stream()
						.collect(Collectors.groupingBy(Student_G::getSex));
				
				System.out.print("[maleStudent] ");
				mapBySex.get(Student_G.Sex.MALE).stream().forEach(s->System.out.print(s.getName()+" "));
				System.out.println();
				
				System.out.print("[femaleStudent] ");
				mapBySex.get(Student_G.Sex.FEMALE).stream().forEach(s->System.out.print(s.getName()+" "));
				System.out.println();
				System.out.println();
				
				Map<Student_G.City,List<String>> mapByCity =totalList.stream().collect(
						Collectors.groupingBy(
								Student_G::getCity,
								Collectors.mapping(Student_G::getName,Collectors.toList())));
				
				System.out.print("[Seoul] ");
				mapByCity.get(Student_G.City.Seoul).stream().forEach(s->System.out.print(s+" "));
				System.out.println();
				
				System.out.print("[Pusan] ");
				mapByCity.get(Student_G.City.Pusan).stream().forEach(s->System.out.print(s+" "));
				System.out.println();
				System.out.println();
				Map<Student_G.City,List<String>> treeMapByCity =totalList.stream().collect(
						Collectors.groupingBy(
								Student_G::getCity,
								TreeMap::new,
								Collectors.mapping(Student_G::getName,Collectors.toList())));
				
				System.out.print("[Seoul] ");
				treeMapByCity.get(Student_G.City.Seoul).stream().forEach(s->System.out.print(s+" "));
				System.out.println();
				
				System.out.print("[Pusan] ");
				treeMapByCity.get(Student_G.City.Pusan).stream().forEach(s->System.out.print(s+" "));
				
				
	}
}


class Student_G {
	public enum Sex {
		MALE, FEMALE
	}

	public enum City {
		Seoul, Pusan
	}

	private String name;
	private int score;
	private Sex sex;
	private City city;

	public Student_G(String n, int s, Sex sex) {
		this.name = n;
		this.score = s;
		this.sex = sex;
	}

	public Student_G(String n, int s, Sex sex, City city) {
		this.name = n;
		this.score = s;
		this.sex = sex;
		this.city = city;
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