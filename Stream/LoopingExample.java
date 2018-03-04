package day15.Stream;

import java.util.Arrays;
import java.util.stream.*;
public class LoopingExample {
	public static void main(String ar[]){
		int[] intAr ={1,2,3,4,5};
		//최종메소드 처리안해서 작동하지않음
		Arrays.stream(intAr).filter(a->a%2==0).peek(n->System.out.println(n));
		
		//sum이 최종 처리메소드라서 작동함.
		IntStream stream=Arrays.stream(intAr);
		stream.filter(a->a%2==0).peek(n->System.out.println(n)).sum();
		System.out.println();
		
		//forEach는 최종메소드
		stream=Arrays.stream(intAr);
		stream.filter(a->a%2==0).forEach(n->System.out.println(n));		
			
		
	}
}
