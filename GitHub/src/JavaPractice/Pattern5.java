package JavaPractice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nsp=0;
		int nst=n;
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
			row=row+1;
			nsp=nsp+1;
			nst=nst-1;
			
			
		}
		
	}

}
