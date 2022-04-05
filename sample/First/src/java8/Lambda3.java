package java8;

//using multiple parameter
interface StringConcat {
	public String sconcat(String a, String b);
}

public class Lambda3 {

	public static void main(String[] args) {

		StringConcat concat=(s1,s2)-> s1+s2;
		
		System.out.println(concat.sconcat("Hani", "ya"));
	}

}
