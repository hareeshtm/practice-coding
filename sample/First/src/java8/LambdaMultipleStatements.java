package java8;

@FunctionalInterface
interface Sayable {
	String say(String message);
}

public class LambdaMultipleStatements {

	public static void main(String[] args) {

		 // You can pass multiple statements in lambda expression 
		Sayable s=(message) -> {
			String str1="I would like to say";
			String str2=str1 + message;
			return str2;
		};
		

		System.out.println(s.say(" u are winner"));
}
}
