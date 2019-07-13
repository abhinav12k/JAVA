package JavaPractice;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		int row = 1;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		while(row<=(2*n-1)) {
			
			//work
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
			}else {
				nst=nst-1;
			}
			
		}

	}

}
