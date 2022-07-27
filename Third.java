package iNeuronasnmt;

public class Third {
	
	//divided pattern into two parts upperpart 7 rows 
	//and lower part 7 rows
	
	
	public static void main(String []args) {
		int row=0, col=0 ,n=14;
		for(row=0;row<n;row++) {
			if(row<n/2) {//upper part
				for(col=0;col<n;col++) {
					//if(row+col>6&&row+col<17&&col-row<6&&col-row>-6) {
					if(row+col>6&&col-row<6) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();	
			}
			else {//lower part
		
				for(col=0;col<n;col++) {
					if(col==0||col==n-1||row==n-1) {
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
}


