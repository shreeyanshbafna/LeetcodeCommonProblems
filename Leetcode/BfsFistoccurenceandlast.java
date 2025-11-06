package Leetcode;

public class BfsFistoccurenceandlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
		int target = 2;

		int first = firstOccurrence(arr, target);
		int last = lastOccurrence(arr, target);
	}

	private static int lastOccurrence(int[] arr, int target) {
		int l = 0, r = arr.length - 1;
		int result = -1;
		// TODO Auto-generated method stub

		while (l <= r) {
			int mid = l + ((l - 1) / 2);
			if (arr[mid] == target) {
				result = mid;
				l = mid + 1; // look in right as we have to last occurence

			} else if (arr[mid] < target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}

		}
		return result;
	}

	private static int firstOccurrence(int[] arr, int target) {
		int l = 0, r = arr.length - 1;
		while (l <= r)

		{
			int mid = l + ((l - 1) / 2);
			int result = -1;

			if (arr[mid] == target) {
				result = mid;
				l = mid + 1;
			}
			if (arr[mid] > target) {

			}
		}
		return r;

	}
}
