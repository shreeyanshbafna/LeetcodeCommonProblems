package Leetcode;

public class BinarySear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int target = 9;

		int y = bst11(a, target);
		System.out.println(y);
	}

	static int bst11(int[] a, int target) {
		int start = 0;
		int end = a.length - 1;
		int mid = 0;
		// System.out.println(mid);
		if (target > a[0] || target < a[a.length - 1]) {
			return -1;
		}

		while (start <= end) {
			mid = start + (end - start) / 2;
			if (a[mid] == target)
				return mid;

			if (a[mid] < target)
	            end = mid - 1;
	        else
	            start = mid + 1;

		}
		return -1;

	}

}
