package Leetcode;

public class BuySellStockSingleTransaction {

	public static void main(String[] args) {
		int[] stock = { 12, 4, 16, 15, 7, 18 };
		int maxvalue = 0;
		int min = stock[0];
		for (int i = 0; i < stock.length; i++) {
			min = Math.min(min, stock[i]);
			if (i != 0) {
				maxvalue = Math.max(maxvalue, stock[i] - min);
			}
		}
		System.out.println(maxvalue);
	}

}
