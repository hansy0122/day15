package day15.Stream;

import java.util.*;
import java.util.stream.*;
public class StreamExample4 {
	public static void main(String ar[]){
		List<Member> list =Arrays.asList(new Member("A","developers"),new Member("B","developers"),new Member("C","doctor"));
		Map<String,List<String>> groupingMap =list.stream()
				.collect(Collectors.groupingBy(Member::getJob,Collectors.mapping(Member::getName, Collectors.toList())));
				System.out.print("[developer]: ");
				groupingMap.get("developers").stream().forEach(s->System.out.print(s+" "));
				System.out.println();
				System.out.print("[doctor]: ");
				groupingMap.get("doctor").stream().forEach(s->System.out.print(s+" "));
				
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

