package JavaPractice;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nst=n;
		while(row<=n) {
			
			//work
			int cst=1;
			while(cst<=nst) {
				
				System.out.print("*");
				cst=cst+1;
			}
			
			//prep
			System.out.println();
			nst=nst-1;
			row=row+1;
		}
		

	}

}
