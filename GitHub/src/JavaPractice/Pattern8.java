package JavaPractice;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		while(row<=n) {
			
			//work
			int col = 1;
			while(col<=n) {
				if(col==row||(col+row)==n+1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}

	}

}
