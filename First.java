package iNeuronasnmt;

public class First {
	public static void main(String []args) {
		int row=0,col=0,n=5;
		
		
		//I
		
		for(row=0;row<n;row++) {
			for(col=0;col<1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//N
		for(row=0;row<n;row++) {
			for(col=0;col<n;col++) {
				if(col==0||col==n-1||row==col) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//E
		for(row=0;row<n;row++) {
			for(col=0;col<n;col++) {
				if(col==0||row==0||row==n/2||row==n-1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//U
		for(row=0;row<n;row++) {
			for(col=0;col<n;col++) {
				if(col==0||col==n-1||row==n-1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//R
		for(row=0;row<n;row++) {
			for(col=0;col<n;col++) {
				if(col==0||row==0||row==n/2||(row==n-2&&col==n-2)||(row==n-1&&col==n-1)||(row==1&&col==4)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//O
		for(row=0;row<n;row++) {
			for(col=0;col<n;col++) {
				if(col==0||col==n-1||row==0||row==n-1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//N
		for(row=0;row<n;row++) {
			for(col=0;col<n;col++) {
				if(col==0||col==n-1||row==col) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
	}
}
