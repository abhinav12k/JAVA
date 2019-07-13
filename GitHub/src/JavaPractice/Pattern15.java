package JavaPractice;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
		while(row<=2*n-1){
			
			//work
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" ");
				csp=csp+1;
			}
			int cst=1;
			while(cst<=nst){
				
				System.out.print("*");
				cst=cst+1;
			}
			
			//prep
			
			if(row<n) {
				nsp=nsp+2;
				nst=nst-1;
				
			}else {
				nsp=nsp-2;
				nst=nst+1;
			}
			System.out.println();
			row=row+1;
			
		}
		

	}

}
