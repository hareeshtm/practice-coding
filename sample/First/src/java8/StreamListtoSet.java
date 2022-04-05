package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Convert List into Set
class Product3 implements Comparable<Product3>{  
    int id;  
    String name;  
    float price;  
    public Product3(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	@Override
	public int compareTo(Product3 o) {
		if(price>o.price)
			return 1;
		else if(price==o.price)
			return 0;
		else
		return -1;
	}  
}
	

public class StreamListtoSet {

	public static void main(String[] args) {
	
		Set<Product3> productsList = new HashSet<Product3>();  
		 productsList.add(new Product3(1,"HP Laptop",25000f));  
	        productsList.add(new Product3(2,"Dell Laptop",30000f));  
	        productsList.add(new Product3(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product3(4,"Sony Laptop",28000f));  
	        productsList.add(new Product3(5,"Apple Laptop",90000f));  
	        
	        Set<Float> priceList=productsList.stream().filter(pro->pro.price<30000).map(pro->pro.price).collect(Collectors.toSet());
	        
	        Set<String> names=productsList.stream().map(e->e.name).collect(Collectors.toSet());
	        System.out.println(names);
	        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
	        List<Integer> squares=num.stream().map(n-> n*n).collect(Collectors.toList());
	        System.out.println(squares);
	        TreeSet<Product3> set= new TreeSet<Product3>(productsList);
	        for(Product3 p: set)
	        	System.out.println(p.price);
	        
	       
	        
	}

}
