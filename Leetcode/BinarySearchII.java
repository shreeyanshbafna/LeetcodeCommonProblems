package Leetcode;

import java.util.Arrays;

public class BinarySearchII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 7, 8, 9 };
		int target = 7;

		int[] res = bst(a, target);

System.out.println(Arrays.toString(res));
	}

	private static int[] bst(int[] a, int target) {
		int first = 0;
		int last = 0;
		first = bstfirst(a, target);
		last = bstlast(a, target);
		System.out.println(last);
		System.out.println(first);

		return new int[] { first, last };
		// TODO Auto-generated method stub

	}

	private static int bstlast(int[] a, int target) {
		int start = 0;
		int end = a.length;
		int mid = start + (end - start) / 2;
		int last = -1;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (a[mid] == target) {
				last = mid;
				start = mid + 1;
			}
			if (a[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return last;
	}

	private static int bstfirst(int[] a, int target) {
		int start = 0;
		int end = a.length;
		int mid = 0;
		int first = -1;

		while (start <= end) {
			mid = start + (end - start) / 2;

			if (a[mid] == target) {
				first = mid;
				end = mid - 1;
			}
			if (a[mid] < target) { 
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return first;
	}

}
