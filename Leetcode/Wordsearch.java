package Leetcode;

public class Wordsearch {

	public static void main(String[] args) {
		char[][] board = { { 'Q', 'W', 'Y', 'K' }, { 'T', 'U', 'O', 'L' }, { 'P', 'M', 'N', 'B' } };
		String word = "QWUMP";

		boolean f = exist(board, word);
		System.out.println(f);
	}

	private static boolean exist(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;
		// System.out.println(m + " " + n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (dfs(board, word, i, j, 0))
					return true;
			}
			System.out.println();
		}
		return false;
	}

	private static boolean dfs(char[][] board, String word, int row, int column, int index) {
		if (index == word.length()) {
			return true;
		}
		if (row < 0 || column < 0 || row >= board.length || column >= board[0].length
				|| board[row][column] != word.charAt(index)) {
			return false;
		}

		char temp = board[row][column];

		board[row][column] = '#';
		boolean found = dfs(board, word, row - 1, column, index + 1) || dfs(board, word, row, column - 1, index + 1)
				|| dfs(board, word, row + 1, column, index + 1) || dfs(board, word, row, column + 1, index + 1);
		board[row][column] = temp;
		return found;
	}

}
