package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 1, 2, 3, 4, 5, 6 };

		String[] a1 = { "a", "b" };
		String[] b1 = { "a", "b" };
		List<String> l1 = Arrays.asList("Cat", "cats", "catsed", "catseed");
		Optional<String> f = l1.stream().max(Comparator.comparing(String::length));
		if (f.isPresent())
			System.out.println(f.get());
		String h = Collections.min(l1);
		System.out.println(h);

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		String[] r = Stream.concat(Arrays.stream(a1), Arrays.stream(b1)).toArray(String[]::new);
         System.out.println(Arrays.toString(c)+"naaam"+Arrays.toString(r));
	}

}
