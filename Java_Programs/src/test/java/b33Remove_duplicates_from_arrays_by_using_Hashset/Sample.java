package b33Remove_duplicates_from_arrays_by_using_Hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sample {
	
	public static void main(String[] args) {
		
		int[] a = {2,3,4,5,5,6,7,8,9,8,7,6}; //Array with duplicate values
		
		Set<Integer> set = new HashSet<Integer>(); //we create hashset for adding the objects
		
		for(int i=0; i<a.length; i++) { //this for loop will iterate each value and add to hashset
			
			set.add(a[i]); 
			/*
			 * this command isto add the elements into hashset and it will add only unique elements, 
			   It will not add duplicates.
			 */
			
		}
		
		Integer[] b = set.toArray(new Integer[set.size()]); 
		/*
		 * The above toArraay() command will convert the HashSet to Array, but it will return Object,
		   to convert object to array we give like this toArray(new Integer[set.size()]) then this 
		   will convert to Integer, then we convert Integer to Array like this Arrays.toString(b).
		 */
		
		System.out.println(Arrays.toString(b));
		
	}

}
