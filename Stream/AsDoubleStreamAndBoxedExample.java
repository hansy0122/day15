package day15.Stream;
import java.util.*;
import java.util.stream.*;


public class AsDoubleStreamAndBoxedExample {
	public static void main(String ar[]){
		int[] intArr={1,2,3,4,5};
		IntStream intStream=Arrays.stream(intArr);
		intStream.asDoubleStream().forEach(d->System.out.println(d));
		System.out.println();
		
		//����� ��Ʈ���� ������.
		intStream=Arrays.stream(intArr);
		intStream.boxed().forEach(obj->System.out.println(obj.intValue()));
	}
}
