package day15.Stream;
import java.util.*;

public class ArrayListVsLinkedListExample {
	
	//handle elements
	public static void work(int value){	
	}
	
	// Parallel Process
	public static long testParallel(List<Integer> list){
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		long end=System.nanoTime();
		return end-start;
	}
	public static void main(String ar[]){
		List<Integer> arrayList=new ArrayList<>();
		List<Integer> linkedList=new LinkedList<>();
		for(int i=0;i<6000000;i++){
			arrayList.add(i);
			linkedList.add(i);
		}
		//warming up
		long arrayListParallel =testParallel(arrayList);
		long linkedListParallel=testParallel(linkedList);
	
		arrayListParallel =testParallel(arrayList);
		linkedListParallel=testParallel(linkedList);
		if(arrayListParallel<linkedListParallel){
			System.out.println("linkedListParallel slow");
		}else {
			System.out.println("linkedListParallel fast");
		}
	}
}
