package day15.Stream;
import java.util.*;



public class MatchExample {
	public static void main(String ar[]){
		int intArr[]={2,4,6};
		
		boolean result=Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println("��� 2�� ����ΰ� "+result);
		
		result=Arrays.stream(intArr).allMatch(a->a%3==0);
		System.out.println("�ϳ��� 3�� ����ΰ� "+result);
		
		result=Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println("3�� ����� ����? "+result);
	}
}