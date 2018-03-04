package day15.Stream;
import java.util.*;

public class FilteringExample {
	public static void main(String ar[]){
		List<String> names =Arrays.asList("Ana","Bora","Cow","AoA","Ace","Dog","Ana","Ana");
		//그냥출력
		names.stream().forEach(s->System.out.println(s));
		System.out.println();
		//종복되는거 제거후 출력
		names.stream().distinct().forEach(s->System.out.println(s));
		System.out.println();
		//A로시작되는 거만 출력
		names.stream().filter(n->n.startsWith("A")).forEach(s->System.out.println(s));
		System.out.println();
		//중복 제거후 A로 시작되는거만 출력
		names.stream().distinct().filter(n->n.startsWith("A")).forEach(s->System.out.println(s));
		
	}
}
