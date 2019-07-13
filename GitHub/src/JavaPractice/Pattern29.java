package JavaPractice;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int row=1;
		int nst=1;
		int nsp=n-1;
		
		while(row<=n) {
			int val=row;
			//work
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				if(cst==nst||cst==1) {
					System.out.print(val);
				}else {
					val=0;
					System.out.print(val);
				}
				cst++;
			}
			
			
			//prep
			System.out.println();
			row=row+1;
			nst=nst+2;
			nsp=nsp-1;
			
		}

	}

}
