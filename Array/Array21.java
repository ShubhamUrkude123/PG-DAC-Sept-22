//21. How to convert Array to ArrayList in java ?

// Java program to demonstrate conversion of
// Array to ArrayList of fixed-size.
import java.util.*;

class Array21
{
	public static void main (String[] args)
	{
		String[] geeks = {"Rahul", "Utkarsh",
						"Shubham", "Neelam"};

		// Conversion of array to ArrayList
		// using Arrays.asList
		List al = Arrays.asList(geeks);

		System.out.println(al);
	}
}

/*
[Rahul, Utkarsh, Shubham, Neelam]
*/