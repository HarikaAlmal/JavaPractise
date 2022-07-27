package iNeuronasnmt;

public class Fourth {
	public static void main(String []args) {
		int row=0, col=0 ,n=14;
		
		
		//for upper part space
		for(row=0;row<n/2;row++) {
			for(col=0;col<n;col++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//pattern
		for(row=(n-1)/2;row<n;row++) {
			for(col=0;col<n;col++) {
				if(row+col<19&&row+col>6&&col-row>-6&&col-row<7) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
