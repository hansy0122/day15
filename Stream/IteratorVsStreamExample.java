package day15.Stream;

import java.util.*;
import java.util.stream.*;

public class IteratorVsStreamExample {
public static void main(String ar[]){
	List<String> list =Arrays.asList("hong","ana","java");
	
	//Iterator이용
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()){
		String str=iterator.next();
		System.out.println(str);
	}
	
	System.out.println();
	
	//Stream이용
	Stream<String> stream =list.stream();
	stream.forEach((name ->System.out.println(name)));
	
	
}
}
