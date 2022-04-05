/*
Since, Java array implements the Cloneable interface, we can create the clone of the Java array. 
If we create the clone of a single-dimensional array, it creates the deep copy of the Java array.
It means, it will copy the actual value. But, if we create the clone of a multidimensional array, 
it creates the shallow copy of the Java array which means it copies the references.
 */
package TwoDimensionalArray;

public class CloningSingleMulti {

	public static void main(String[] args) {
		int singArr[]= {1,2,3};
		System.out.println("Printing original 1-D array");
		for(int i:singArr)
			System.out.print(i+" ");
		System.out.println("Printing clone of the 1-D array:");  
		int cloneSingArr[]=singArr.clone();//deep copy
		for(int i:cloneSingArr)
			System.out.print(i+" ");
		System.out.println("\nAre both equal?");  
		System.out.println(singArr==cloneSingArr);
		/////////////////////////////////////////////////////////
		int mulArr[][]= {{1,2,3},{4,5,6}};
		System.out.println("Printing original 2-D array");
		for(int i=0;i<mulArr.length;i++)
		{
			for(int j:mulArr[i])
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("Printing clone of the 2-D array:");  
		int clonemulArr[][]=mulArr.clone();//shallow copy
		for(int i=0;i<clonemulArr.length;i++)
		{
			for(int j:clonemulArr[i])
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("\nAre both equal?");  
		System.out.println(mulArr==clonemulArr);
		
		mulArr[1][0]=9;
		
	System.out.println("After changing");
		for(int i=0;i<clonemulArr.length;i++)
		{
			for(int j:clonemulArr[i])
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
