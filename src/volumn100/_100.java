package volumn100;

import java.io.BufferedInputStream;
import java.util.Scanner;

class _100 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		while (in.hasNextInt()) { // 多組輸入，必須使用迴圈來讀取資料
			int a = in.nextInt(), b = in.nextInt(), max = 0;///22222222
			for (int i = (a < b) ? a : b; i <= a || i <= b; ++i) {
				if ((cycleLength(i, 1)) > max)
					max = cycleLength(i, 1);
			}
			System.out.println(a + " " + b + " " + max); // 只需印出答案即可
		}
	}

	public static int cycleLength(int num, int len) {
		if (num == 1)
			return len;
		return cycleLength(((num & 1) == 1) ? (3 * num + 1) : (num >> 1), ++len);
	}

}
