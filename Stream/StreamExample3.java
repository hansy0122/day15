package day15.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamExample3 {
	public static void main(String ar[]){
		List<Member> list =Arrays.asList(new Member("A","developers"),new Member("B","developers"),new Member("C","doctor"));
		List<Member> developers =list.stream().filter(m->m.getJob().equals("developers")).collect(Collectors.toList());
				developers.stream().forEach(m->System.out.println(m.getName()));
	}

static class Member{
	private String name;
	private String job;
	
	public Member(String name,String job){
		this.name=name;
		this.job=job;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}	
}
}
