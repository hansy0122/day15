package day15.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String ar[]) throws IOException{
		Path path =Paths.get("C:\\java\\eclipse\\workspace\\java-study");
		Stream<Path> stream=Files.list(path);
		stream.forEach(p->System.out.println(p.getFileName()));
		
	}
}
