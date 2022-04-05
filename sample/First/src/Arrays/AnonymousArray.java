package Arrays;
//Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.
public class AnonymousArray {

	static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static void main(String[] args) {
		printArray(new int[] {1,2,3,4,5});//passing anonymous array to method
	}

}
