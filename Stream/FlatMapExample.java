package day15.Stream;
import java.util.*;

public class FlatMapExample {
	public static void main(String ar[]){
		List<String> list1=Arrays.asList("AAA BBB","CCC DDD","EEE FFF");
		list1.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(word->System.out.println(word));
		System.out.println();
		
		List<String> list2=Arrays.asList("10, 20, 30","40, 50, 60");
		list2.stream().flatMapToInt(data->{String[] Ar=data.split(","); 
		int[] intArr=new int[Ar.length];
		for(int i=0;i<Ar.length;i++){
			intArr[i]= Integer.parseInt(Ar[i].trim());
		}
		return Arrays.stream(intArr);
		}).forEach(n->System.out.println(n));
	}
}
