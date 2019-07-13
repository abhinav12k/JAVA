package JavaPractice;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
			
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int row =1;
		int nsp=-1;
		int nst=n;
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
			if(row==1)
				cst=2;
			while(cst<=nst) {
				
				System.out.print("*");
				cst=cst+1;
			}
			
			//prep
			System.out.println();
			nsp=nsp+2;
			nst=nst-1;
			row=row+1;
		}
		
		
	}

}
