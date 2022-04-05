package Arrays;

import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	int[] arr = {11,55,22,0,89};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	String[] names = {"Steve", "Ajeet", "Kyle"};
	Arrays.sort(names);
	System.out.println(Arrays.toString(names));
}
}
