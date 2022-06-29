package java8;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		Stream.of(1,11,111,2,22,222).forEach(x->System.out.println(x));
		String name[]= {"Hareesh","Arya","Amma","Achan"};
		Stream.of(name).forEach(n->System.out.println(n));
	
	}
}
