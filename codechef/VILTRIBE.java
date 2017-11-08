package competitions;

import java.util.Scanner;

class VILTRIBE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			int l=s.length();
			int ct1=0,ct2=0,op=0;
			char temp=0;
			for(int i=0;i<l;i++) {
				if(s.charAt(i)=='A') {
					ct1++;
					if(temp=='A') {
						ct1+=op;
						
					}
					op=0;
					temp='A';
				}
				else if(s.charAt(i)=='B') {
					ct2++;
					if(temp=='B') {
						ct2+=op;
						
					}
					op=0;
					temp='B';
				}
				else {
					op++;
				}
			}
			System.out.println(ct1+" "+ct2);
		}
	}

}
