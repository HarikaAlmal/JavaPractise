package iNeuronasnmt;

public class Five {
	public static void main(String []args) {
		int row=0,col=0,n=14;
		//System.out.println(row+" "+col+" "+n);
		for(row=0;row<n;row++) {
			System.out.print("*");
		}
		System.out.println();
		//System.out.println(row+" "+col+" "+n);
		for(row=(n-1)/2;row>0;row--) {
			for(col=0;col<row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(row=1;row<((n-1)/2)+1;row++) {
			for(col=0;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println(col);
		for(row=0,col=0;col<n;row++,col++) {
			System.out.print("*");
		}
	}

}
 