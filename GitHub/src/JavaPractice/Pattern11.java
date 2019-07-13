package JavaPractice;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp=n-1;
		int nst=1;
		while(row<=n) {
			
			//work
			int csp=1;
			while(csp<=nsp){	
				System.out.print(" ");
				csp=csp+1;
			}
			int cst=1;
			while(cst<=nst){
				if(cst%2==0) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				cst=cst+1;
			}
			System.out.println();
			row=row+1;
			nst=nst+2;
			nsp=nsp-1;
		}

	}

}
