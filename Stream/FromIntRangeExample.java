package day15.Stream;
import java.util.stream.*;

public class FromIntRangeExample {
	public static int sum;
	
	public static void main(String ar[]){
		IntStream stream =IntStream.rangeClosed(1, 100);
		stream.forEach(a->sum+=a);
		System.out.println("sum: "+ sum);
	}
}
