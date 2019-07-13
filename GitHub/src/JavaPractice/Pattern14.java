package JavaPractice;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		int row = 1;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		int nsp=n-1;
		while(row<=(2*n-1)) {
			
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
			row=row+1;
			if(row<=n) {
				nst=nst+1;
				nsp=nsp-1;
			}else {
				nst=nst-1;
				nsp=nsp+1;
			}
			
		}

	}

}
