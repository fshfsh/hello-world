package volumn100;

import java.io.BufferedInputStream;
import java.util.Scanner;

class _100 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		while (in.hasNextInt()) { // �h�տ�J�A�����ϥΰj���Ū�����
			int a = in.nextInt(), b = in.nextInt(), max = 0;///22222222
			for (int i = (a < b) ? a : b; i <= a || i <= b; ++i) {
				if ((cycleLength(i, 1)) > max)
					max = cycleLength(i, 1);
			}
			System.out.println(a + " " + b + " " + max); // �u�ݦL�X���קY�i
		}
	}

	public static int cycleLength(int num, int len) {
		if (num == 1)
			return len;
		return cycleLength(((num & 1) == 1) ? (3 * num + 1) : (num >> 1), ++len);
	}

}
