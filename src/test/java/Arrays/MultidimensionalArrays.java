package Arrays;

import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) 
	{
		int[] array1 = new int[] {1,2,3,5};
		int[] array2 = new int[2];
		//int[] array4 = new int[];
		int[] array3 = {1,2,3,9,0};
		
		int[][] twoArray = new int[2][3];
		
		for(var outerarray :twoArray)
		{
			var element = outerarray;
			System.out.println(Arrays.toString(element));
			for(int e : element)
			{
				System.out.print(e);
			}
			System.out.println();
		}
		
		//System.out.println(Arrays.toString(twoArray));
		
		int[][] thirdarray = new int[3][];
		
		thirdarray[0] = new int[]{1,2,3};
		thirdarray[1] = new int[]{1,2};
		thirdarray[2] = new int[]{1,5};
		System.out.println(Arrays.toString(thirdarray));
		System.out.println(Arrays.deepToString(thirdarray));
		
		for(var innerarray :thirdarray)
		{
			//System.out.println(Arrays.toString(innerarray));
			for(var ele:innerarray)
			{
				//System.out.print(ele);
			}
		}
		
		Object[] objarray = new Object[3];
		objarray[0] = new int[] {2,3,4};
		objarray[1] = new String[] {"hello","world"};
		objarray[2] = new double[]{1.2,4.5};
		
		System.out.println(Arrays.deepToString(objarray));;
		

	}
	
	
	

}
