package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Minimumelementchallenge {

	public static void main(String[] args) {
	
		//int[] newArray = readIntegers(3);;
		//Arrays.sort(newArray);
		//System.out.println(newArray[0]);
		reverseArray();

	}

	private static int[] readIntegers(int s) {
		Scanner scanner = new Scanner(System.in);
		
		int[] userinput = new int[s];
		int i=0;
		while(i<s)
		{
			System.out.println("Enter the  number" );
		
			userinput[i] = scanner.nextInt();
			i++;
		}
		return userinput;
	}
	
	
	public static void reverseArray()
	{
		int[] arr=  {1,2,3,4,5,6,8,9};
		int[] arr3= new int[] {1,2,3};
		System.out.println(Arrays.toString(arr3));
		
		int i=0;
		int j=arr.length-1;
		int temp;
		
		while(i<=(arr.length-1)/2 && j>i)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			System.out.println("i value is "+arr[i]);
			System.out.println("j value is "+arr[j]);
			i++;
			j--;
			System.out.println("#".repeat(5));
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
