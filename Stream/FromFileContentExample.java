package day15.Stream;

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public static void main(String ar[])throws IOException{
		Path path= Paths.get("C:\\java\\eclipse\\workspace\\java-study\\linedata.txt");
		Stream<String> stream;
		
		//Files.lines() �޼ҵ� �̿�
		stream =Files.lines(path,Charset.defaultCharset());
		stream.forEach(System.out::println);
		System.out.println();
		
		//BufferedReader�� lines() �޼ҵ带 �̿� 
		File file=path.toFile();
		FileReader fileReader=new FileReader(file);
		BufferedReader br= new BufferedReader(fileReader);
		stream=br.lines();
		stream.forEach(System.out::println);
	}
}
