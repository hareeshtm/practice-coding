package java8;

import java.util.List;
import java.util.stream.Stream;

//displayign first 6 multiplication of 3
public class StreamLimit {

	public static void main(String[] args) {
		
	Stream.iterate(1, count -> count+1).filter(number -> number%3==0).limit(6).forEach(System.out::println);
	Stream.iterate(1, c->c+2).limit(6).forEach(e->System.out.println(e));
		
	}

}
