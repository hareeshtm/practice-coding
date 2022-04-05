package oops;

class Animal
{
	Animal()
	{
		System.out.println("Animal Constructor");
	}
	
	void sleep()
	{
		System.out.println("sleeping");
	}
	void eat()
	{
		System.out.println("Animal eating");
	}
}
class Dog extends Animal
{
	Dog()
	{
		super();
		System.out.println("Dog Constructor");
	}
	void eat()
	{
		System.out.println("Dog eating");
	}
	void bark()
	{
		System.out.println("Dog barking");
	}
	void work()
	{
		super.eat();
		sleep();
	}
}

public class SuperKeyWord {

	public static void main(String[] args) {
	
	 new Dog().work();
	}

}
