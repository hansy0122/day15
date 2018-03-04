package day15.Stream;
import java.util.*;

public class SequencialVsParallelExample {
	
	public static void work(int value){
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){System.err.println(e);}
	}
	
	public static long testSequencial(List<Integer> list){
		long start = System.nanoTime();
		list.stream().forEach(a->work(a));
		long end=System.nanoTime();
		return end-start;
	}
	

	public static long testParallel(List<Integer> list){
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		long end=System.nanoTime();
		return end-start;
	}
	
	public static void main(String ar[]){
		List<Integer> list=Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		long timeSequencial =testSequencial(list);
		long timeParallel =testParallel(list);
		
		System.out.println("timeSequencial="+timeSequencial);
		System.out.println("timeParallel="+timeParallel);
		System.out.println("timeParallel="+(timeSequencial-timeParallel));
	}
}
