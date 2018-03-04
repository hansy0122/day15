package day15.Stream;
import java.util.*;
public class ParallelStreamExample {

	public static void main(String ar[]) {
		List<Student_Parallel> totallist = Arrays.asList(new Student_Parallel("A", 10, Student_Parallel.Sex.MALE),
				new Student_Parallel("B", 20, Student_Parallel.Sex.MALE), new Student_Parallel("C", 30, Student_Parallel.Sex.MALE),
				new Student_Parallel("D", 40, Student_Parallel.Sex.FEMALE));
		
		MaleStudent_Parallel maleStudent=totallist.parallelStream().filter(s->s.getSex()==Student_Parallel.Sex.MALE)
				.collect(
						()->new MaleStudent_Parallel(),
						(r,t)->r.accumulate(t),
						(r1,r2)->r1.combine(r2)
						);
		
		maleStudent.getList().stream().forEach(s->System.out.println(s.getName()));

	}
}

class MaleStudent_Parallel {
	private List<Student_Parallel> list;

	public MaleStudent_Parallel() {
		list = new ArrayList<>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent_Parallel()");
	}

	public void accumulate(Student_Parallel student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}

	public void combine(MaleStudent_Parallel other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}

	public List<Student_Parallel> getList() {
		return list;
	}

}

class Student_Parallel {
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

	public Student_Parallel(String n, int s, Sex sex) {
		this.name = n;
		this.score = s;
		this.sex = sex;
	}

	public Student_Parallel(String n, int s, Sex sex, City city) {
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

