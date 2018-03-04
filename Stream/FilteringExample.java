package day15.Stream;
import java.util.*;

public class FilteringExample {
	public static void main(String ar[]){
		List<String> names =Arrays.asList("Ana","Bora","Cow","AoA","Ace","Dog","Ana","Ana");
		//�׳����
		names.stream().forEach(s->System.out.println(s));
		System.out.println();
		//�����Ǵ°� ������ ���
		names.stream().distinct().forEach(s->System.out.println(s));
		System.out.println();
		//A�ν��۵Ǵ� �Ÿ� ���
		names.stream().filter(n->n.startsWith("A")).forEach(s->System.out.println(s));
		System.out.println();
		//�ߺ� ������ A�� ���۵Ǵ°Ÿ� ���
		names.stream().distinct().filter(n->n.startsWith("A")).forEach(s->System.out.println(s));
		
	}
}
