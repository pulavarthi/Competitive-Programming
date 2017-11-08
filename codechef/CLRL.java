package competitions;

import java.util.Scanner;

class CLRL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int r=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
			int flag=1;
			for(int i=0;i<n-1;i++) {
				if(a[i]>r) {
					if(a[i]>max) {
						flag=0;
						break;
					}
					max=a[i];
				}
				if(a[i]<r) {
					if(a[i]<min)
					{
						flag=0;
						break;
						
					}
					min=a[i];
				}
			}
			if(flag==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
