package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets_merging {

	// Java Program to Demonstrate Merging of two sets in Java
	// Using Double brace Initialization

	// Importing required classes

		// Method 1
		// To merge two sets
		// using DoubleBrace Initialisation
		public static <T> Set<T> mergeSet(Set<T> a, Set<T> b)
		{

			// Adding all elements of respective Sets
			// using addAll() method
			return new HashSet<T>() {
				{
					addAll(a);
					addAll(b);
				}
			};
		}

		// Method 2
		// Main driver method
		public static void main(String[] args)
		{

			// Creating the sets to be merged

			// First set
			Set<Integer> a = new HashSet<Integer>();
			// Applying Arrays.asList()
			a.addAll(
				Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 }));

			// Second set
			Set<Integer> b = new HashSet<Integer>();
			// Applying Arrays.asList()
			b.addAll(
				Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

			// Printing the Sets
			System.out.println("Set a: " + a);
			System.out.println("Set b: " + b);

			// Calling Method 1 to merge above Sets
			System.out.println("Merged Set: " + mergeSet(a, b));
		}
	}
