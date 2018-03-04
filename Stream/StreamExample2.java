package day15.Stream;
import java.util.*;

public class StreamExample2 {
	public static void main(String ar[]){
		List<Member> list =Arrays.asList(new Member("A",30),new Member("B",40),new Member("C",15));
		double avg=list.stream().mapToDouble(m->m.getAge()).average().getAsDouble();
				System.out.println("average Age="+avg);
	}
	static class Member{
		private String name;
		private int age;
		
		public Member(String name,int age){
			this.name=name;
			this.age=age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}
}
