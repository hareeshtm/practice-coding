package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
	private double salary;
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
public class StreamSortEmployee {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("George", 10, 10000));
		employees.add(new Employee("Robert", 12, 15000));
		employees.add(new Employee("Kathy", 24, 25000));
		employees.add(new Employee("George", 10, 5000));
		//sorting employees based on salary and displaying first 2 small salaries
		employees.stream().sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
		.limit(2)
		.forEach(e->System.out.println(e.getSalary()));

		
		System.out.println("-----------------------------------");
		//fetching top 2 salaried employees
		// and displaying after storing
		
		List<Employee> desSort=employees
				.stream()
				.sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary())).limit(2)
				.collect(Collectors.toList());
		
		//sorting employees having salary less than 2nd highest salary
		
		System.out.println("-----------------------------------sorting employees having salary less than 2nd highest salary");
		employees.stream().sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
		.skip(2)
		.forEach(e->System.out.println(e.getSalary()));
		
		//sorting employees having salary less than 2nd highest salary AND DISPLAYING ONLY 1ST SALARY WHICH IS LESS THAN 2ND HIGHEST 
		
				System.out.println("-----------------------------------sorting employees having salary less than 2nd highest salary only 1");
				Optional<Employee> emp=employees.stream().sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.skip(2)
				.findFirst();
				System.out.println(emp.get().getSalary());
		System.out.println("-----------------------------------sorting employees by name");
		//sorting by name
		
		employees.stream()
		.sorted((e1,e2)-> e1.getName().compareTo(e2.getName()))
		.limit(2)
		.forEach(n->System.out.println(n.getName()));
		for(Employee e:desSort)
			System.out.println(e.getSalary());
		
		
		System.out.println("-----------------------------------filter duplicate employee with same name");
		List<String> names=employees.stream().map(e->e.getName()).collect(Collectors.toList());//contains all names
		Set<String> uniqueNames=new HashSet<String>();
		Set<String> dupNames=names.stream().filter(name-> !uniqueNames.add(name)).collect(Collectors.toSet());
		System.out.println(dupNames);
		
		Set<String> uniqueName=new HashSet<String>();
		Set<Employee> dupNameEmp=employees.stream().filter(ob->!uniqueName.add(ob.getName())).collect(Collectors.toSet());
		for(Employee e:dupNameEmp)
			System.out.println(e.getName());
		
		System.out.println("-----------------------------------filter duplicate employee with same name using"
				+ " Collectors.groupingBy");
		Map<String,Long> mapofNames=names.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<String> duplNames=mapofNames.entrySet().
		stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toSet());
		System.out.println(duplNames);
		
		System.out.println("-----------------------------------filter duplicate employee with same name using"
				+ " Collections.frequency(list,i)");
		Set<String> dpliNames=names.stream()
				.filter(name->Collections.frequency(names, name)>1).collect(Collectors.toSet());
		System.out.println(dpliNames);
		
		System.out.println("-----------------------------------Minimum salary using Min()");
		System.out.println(employees.stream().map(e->e.getSalary()).min((e1,e2)->e1.compareTo(e2)));
		
		System.out.println("-----------------------------------Maximum salary using Max()");
		System.out.println(employees.stream().map(e->e.getSalary()).max((e1,e2)->e1.compareTo(e2)));
		
		
	}
	

}