package JavaPractice;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		while(row<=n) {
			int val=5;
			//work
			int col = 1;
			while(col<=n) {
				if(col+row==n+1) {
					System.out.print("*");
					val--;
				}else {
					System.out.print(val);
					val--;
				}
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}

	}

}
