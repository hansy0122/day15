package day15.Stream;
import java.util.*;



public class MatchExample {
	public static void main(String ar[]){
		int intArr[]={2,4,6};
		
		boolean result=Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println("모두 2의 배수인가 "+result);
		
		result=Arrays.stream(intArr).allMatch(a->a%3==0);
		System.out.println("하나라도 3의 배수인가 "+result);
		
		result=Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println("3의 배수가 없니? "+result);
	}
}
