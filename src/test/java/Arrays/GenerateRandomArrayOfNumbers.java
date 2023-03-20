package Arrays;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomArrayOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(getRandomNumbers(23)));;
		System.out.println(("*").repeat(10));
		System.out.println(Arrays.toString(getCopiedArray()));;
		doBinarySearch();
		compareArrays();
		sortArrays();
		
	}
	
	public static int[] getRandomNumbers(int len)
	{
		Random random = new Random();
		
		int[] integerArray = new int[len];
		
		for (int i=0;i<len;i++)
		{
			integerArray[i] =random.nextInt(34,120);
		}
		return integerArray;
		
	}
	
	public static int[] getCopiedArray()
	
	
	{
		int[] original=getRandomNumbers(14);
		int[] duplicate =Arrays.copyOf(original, original.length);
		System.out.println(Arrays.toString(original));
		Arrays.sort(duplicate);
		return  duplicate;
		
	}

	public static void doBinarySearch()
	{
		String[] array1 = {"hello","mark","doing","work"};
		
		System.out.println(Arrays.binarySearch(array1, "doing"));;
	}
	public static void compareArrays()
	{
		String[] array1 = {"hello","mark","doing","work"};
		String[] array2 = {"hello","mark","doing","mayter"};
		
		System.out.println(Arrays.equals(array1, array2));;
	}
	
	public static void sortArrays()
	{

		//int[] original=getRandomNumbers(14);
		//int[] duplicate =Arrays.copyOf(original, original.length);
		int[] duplicate = {3,4,2,9,8};
		//System.out.println(Arrays.toString(original));
		boolean flag = true;
		int  temp;
		
		while(flag)
		{
			flag = false;
			for (int i=0;i<duplicate.length-1;i++)
			{
				if(duplicate[i] < duplicate[i+1])
				{
					temp=duplicate[i];
					duplicate[i]=duplicate[i+1];
					duplicate[i+1]=temp;
					System.out.println("Arrays inside forloop "+Arrays.toString(duplicate));
					flag= true;
				}
				
				
				System.out.println("Arrays outside  forloop "+Arrays.toString(duplicate));
			}
		}
		
	}
}
