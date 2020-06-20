import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class removeduplicate
{
	public static void removeduplicateusingset(int arr[])
	{
		Set<Integer> set=new HashSet<>();			// Defining a set
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);// For adding values in the set
		}	
		//set.forEach(elem->System.out.print(elem+" "));	
		for(int j:set)
		{
			System.out.println(j+" ");
		}
	// Printing the values of set
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("the array elements are:"+arr[i]);
		}
		removeduplicateusingset(arr);
	}
}