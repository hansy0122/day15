package day15.Stream;

import java.util.*;



public class MaleStudentExample {
	public static void main(String ar[]) {
		List<Student_M> totallist = Arrays.asList(new Student_M("A", 10, Student_M.Sex.MALE),
				new Student_M("B", 20, Student_M.Sex.MALE), new Student_M("C", 30, Student_M.Sex.MALE),
				new Student_M("D", 40, Student_M.Sex.FEMALE));
		
		MaleStudent maleStudent=totallist.stream().filter(s->s.getSex()==Student_M.Sex.MALE)
				.collect(
						()->new MaleStudent(),
						(r,t)->r.accumulate(t),
						(r1,r2)->r1.combine(r2)
						);
		
		maleStudent.getList().stream().forEach(s->System.out.println(s.getName()));

	}
}

class MaleStudent {
	private List<Student_M> list;

	public MaleStudent() {
		list = new ArrayList<>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}

	public void accumulate(Student_M student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}

	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}

	public List<Student_M> getList() {
		return list;
	}

}

class Student_M {
	public enum Sex {
		MALE, FEMALE
	}

	public enum City {
		Seoul, pusan
	}

	private String name;
	private int score;
	private Sex sex;
	private City city;

	public Student_M(String n, int s, Sex sex) {
		this.name = n;
		this.score = s;
		this.sex = sex;
	}

	public Student_M(String n, int s, Sex sex, City city) {
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