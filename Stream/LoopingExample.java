package day15.Stream;

import java.util.Arrays;
import java.util.stream.*;
public class LoopingExample {
	public static void main(String ar[]){
		int[] intAr ={1,2,3,4,5};
		//�����޼ҵ� ó�����ؼ� �۵���������
		Arrays.stream(intAr).filter(a->a%2==0).peek(n->System.out.println(n));
		
		//sum�� ���� ó���޼ҵ�� �۵���.
		IntStream stream=Arrays.stream(intAr);
		stream.filter(a->a%2==0).peek(n->System.out.println(n)).sum();
		System.out.println();
		
		//forEach�� �����޼ҵ�
		stream=Arrays.stream(intAr);
		stream.filter(a->a%2==0).forEach(n->System.out.println(n));		
			
		
	}
}
