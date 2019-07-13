package JavaPractice;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst=3;
		int nsp=1;
		while(row<=n) {
			
			//work
			int cst=1;
			while(cst<=nst) {
				
				System.out.print("*");
				cst=cst+1;
			}
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" ");
				csp=csp+1;
			}
			cst=1;
			while(cst<=nst) {
				
				System.out.print("*");
				cst=cst+1;
			}
			
			//prep
			System.out.println();
			if(row<=n/2) {
				nsp=nsp+2;
				nst=nst-1;
			}else {
				nsp=nsp-2;
				nst=nst+1;
			}
			row=row+1;
		}

	}

}
