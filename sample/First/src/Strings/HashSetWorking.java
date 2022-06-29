package Strings;

import java.util.HashSet;

class Color
{
	private String name;
	
	
	public Color(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}
	
}
public class HashSetWorking {

	public static void main(String[] args) {
		
		Color c1=new Color("Red");
		Color c2=new Color("Red");
		Color c3=new Color("Black");
		
		HashSet<Color> c=new HashSet<Color>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c);
	}


}
