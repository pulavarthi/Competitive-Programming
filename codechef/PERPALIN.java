package competitions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class PERPALIN {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int p=sc.nextInt();
			String str="";
			char a[]=new char[p];
			if(p==1 || p==2) {
				System.out.println("impossible");
				continue;
			}
			else {
				Arrays.fill(a, 'b');
				a[0]='a';
				a[p-1]='a';
				str=String.valueOf(a);
			}			
			System.out.println(String.join("", Collections.nCopies(n/p, str)));
		}
	}
}
