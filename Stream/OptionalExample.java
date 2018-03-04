package day15.Stream;
import java.util.*;
public class OptionalExample {
	public static void main(String ar[]){
			
		List<Integer> list =new ArrayList<>();
		try{
			double avg=list.stream().mapToInt(Integer::intValue).average().getAsDouble();
			System.out.println("average="+avg);
		}catch(Exception e){
			System.err.println("error="+e);
		}
		System.out.println();
		
		
		//method 1
		OptionalDouble optional=list.stream().mapToInt(Integer::intValue).average();
		if(optional.isPresent()){
			System.out.println("average="+optional.getAsDouble());
		}else{
			System.out.println("average="+0.0);
		}
		System.out.println();
		
		//method 2
		double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
		System.out.println();
		
		//method 3
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a->System.out.println(a));
		
	}
}
