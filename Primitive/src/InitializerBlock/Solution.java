package InitializerBlock;

import java.util.Scanner;

public class Solution {
	public static int B;
	public static int H;
	public static boolean flag;

static {
	Scanner can = new Scanner(System.in);
	B = can.nextInt();
	H = can.nextInt();
	if(B > 0 && H > 0) {
		flag = true;
	}
	else {
		System.out.print("java.lang.Exception: Breadth and height must be positive");
	}
}

public static void main (String[] args) {
	if(flag) {
		int area = B*H;
		System.out.print(area);
	}
}
}
