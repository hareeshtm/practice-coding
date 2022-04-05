package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//displaying count of strings of length less than 6
public class Stream1 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		
		long count=names.stream().filter(name-> name.length()<6).count();
		System.out.println(count);
		System.out.println("The strings are");
		List<String> filtered=names.stream().filter(name->name.length()<6).collect(Collectors.toList());
		System.out.println(filtered);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(50);
		double sum=l.stream().collect(Collectors.summingLong(n-> n));
		System.out.println(l.stream().collect(Collectors.summingLong(num->num)));
		System.out.println(sum);
	}

}
