package JavaPractice;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		int row = 1;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		while(row<=(2*n-1)) {
			int val;
			if(row<=n) {
				val=row;
				
			}else {
				 val=2*n-row;
			}
			//work
			int cst=1;
			while(cst<=nst) {
				if(cst%2==0) {
					System.out.print("*");	
				}
				else {
					System.out.print(val);
				}
				cst=cst+1;
			}
			
			//prep
			System.out.println();
			row=row+1;
			if(row<=n) {
				nst=nst+2;
				
			}else {
				nst=nst-2;
				
			}
			
		}

	}

}
