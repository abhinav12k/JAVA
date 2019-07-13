package JavaPractice;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst=1;
		int nsp=n/2;
		while(row<=n) {
			
			//work
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" ");
				csp=csp+1;
			}
			int cst=1;
			while(cst<=nst) {
				
				System.out.print("*");
				cst=cst+1;
			}
			
			//prep
			System.out.println();
			if(row<=n/2) {
				nsp=nsp-1;
				nst=nst+2;
			}else {
				nsp=nsp+1;
				nst=nst-2;
			}
			row=row+1;
		}

	}

}
