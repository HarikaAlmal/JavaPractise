/*************************
 
GuessGame for three players:Rules
-->Guesser 
	generates random number as winning number and provides to umpire
-->Player 
	each player guesses number during their turn and passes to umpire
-->umpire
	decides no of chances
	gets winning number from Guesser
	gets guess numbers from participants/player
	compares guess from both guesser and player and decides the winner 
-->game stops if
	case1: out of chances
	case2: if single player won
-->Main
	ask Umpire to 
		decide no of chances
		get numbers from guesser and player
		decide the winner
		and displays wining number

*****************************/

package iNeuronasnmt;

import java.util.Random;
import java.util.Scanner;

class Guesser{
	
	int rightGuessnum;
	int guessnum() {
		//Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int winnumber = rd.nextInt(10);
		//System.out.println("Guesser please enter the winningnumber");
		//int winnumber = sc.nextInt();
		//System.out.println("Winning number "+ winnumber);
		return winnumber;
		
	}
	
}


class Player{
	int playerGuessnum;
	
	int guessnum(String p){
		Scanner sc = new Scanner(System.in);
		System.out.println( p +" please enter your guess from 1 to 10");
		playerGuessnum = sc.nextInt();
		return playerGuessnum;
		
	}
}



class Umpire{
	int winningnum;
	int p1Guessnum;
	int p2Guessnum;
	int p3Guessnum;
	int chances, chancesCount=0;
	
	String p1 = "Player 1";
	String p2 = "Player 2";
	String p3 = "Player 3";
	
	Player p[] = new Player[3];
	
	
	
	void noOfChances() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Umpire Please enter num of chances from 1 to 10:");
		chances = sc.nextInt();
		//return chances;
	}
	
	
	int getWinNum() {
		Guesser g = new Guesser();
		winningnum = g.guessnum();
		return winningnum;
	}
	
	
	void getPlayerNum() {
		
		
		p[0] = new Player(); 
		p[1] = new Player(); 
		p[2] = new Player(); 
		p1Guessnum=p[0].guessnum(p1);
		p2Guessnum=p[1].guessnum(p2);
		p3Guessnum=p[2].guessnum(p3);
	}
	
	
	
	
	void validateWinner() {
		chancesCount++;
		int status;
		
		if(winningnum==p1Guessnum) { 
			if(winningnum==p2Guessnum&&winningnum==p3Guessnum) {
				
				status = 1;
				System.out.println("All Won!");
				//System.out.println("Winning number is "+ winningnum);
				System.out.println(".............*****************************............");
				System.out.println();
				//go to next round
				secondRound(status);
			}
			else if(winningnum==p2Guessnum) {
				status = 2;
				System.out.println("P1 And P2 Won!....P3 Lost");
				//System.out.println("Winning number is "+ winningnum);
				System.out.println(".............*****************************............");
				System.out.println();
				secondRound(status);
			}
			else if(winningnum==p3Guessnum) {
				status = 3;
				System.out.println("P1 And P3 Won!.....P2 Lost");
				//System.out.println("Winning number is "+ winningnum);
				System.out.println(".............*****************************............");
				System.out.println();
				secondRound(status);
			}
			else {
				System.out.println("Only P1 won!.....P2 and P3 Lost");
				//System.out.println("Winning number is "+ winningnum);
				System.out.println(".............*****************************............");
				System.out.println();
				
			}
		}
		else if(winningnum==p2Guessnum) {
			if (winningnum==p3Guessnum) {
				status = 4;
				System.out.println("P2 And P3 Won....P1 Lost!");
				//System.out.println("Winning number is "+ winningnum);
				System.out.println(".............*****************************............");
				System.out.println();
				secondRound(status);
			}
			else {
				System.out.println("Only P2 Won!");
				//System.out.println("Winning number is "+ winningnum);
				System.out.println(".............*****************************............");
				System.out.println();
			}
					
		}
		else if(winningnum==p3Guessnum) {
			System.out.println("Only P3 Won!");
			//System.out.println("Winning number is "+ winningnum);
			System.out.println(".............*****************************............");
			System.out.println();
		} 
		
		else {
			System.out.println("None Of the Players Won Please Try Again!");
			
			System.out.println("chances from Umpire:"+" "+chances);
			//System.out.println("chancesCount"+ " "+chancesCount);
			System.out.println("chances remaining"+ " "+(chances-chancesCount));
			System.out.println(".............*****************************............");
			System.out.println();
			if(chancesCount<chances) {
				p1Guessnum=p[0].guessnum(p1);
				p2Guessnum=p[1].guessnum(p2);
				p3Guessnum=p[2].guessnum(p3);
				validateWinner();
				
			}
			else {
				System.out.println("Out of chances!");
				//System.out.println("Winning number is "+ winningnum);
				System.out.println(".............*****************************............");
			}	
			
		}
	}
	
	void secondRound(int status) {
		//System.out.println(status);
		
		if(status==1) {
			//conduct second round for all
			System.out.println("next round for all!");
			System.out.println("chances from Umpire:"+" "+chances);
			//System.out.println("chancesCount"+ " "+chancesCount);
			System.out.println("chances remaining"+ " "+(chances-chancesCount));
			System.out.println();
			if(chancesCount<chances) {
				p1Guessnum=p[0].guessnum(p1);
				p2Guessnum=p[1].guessnum(p2);
				p3Guessnum=p[2].guessnum(p3);
				validateWinner();
				
			}
			else {
				System.out.println("Out of chances!");
				System.out.println(".............*****************************............");
			}	
			
		}
		else if(status==2) {
			//second round for p1 and p2
			System.out.println("next round for P1 and P2!");
			System.out.println("chances from Umpire:"+" "+chances);
			//System.out.println("chancesCount"+ " "+chancesCount);
			System.out.println("chances remaining"+ " "+(chances-chancesCount));
			System.out.println();
			if(chancesCount<chances) {
				p1Guessnum=p[0].guessnum(p1);
				p2Guessnum=p[1].guessnum(p2);
				
				validateWinner();
				
			}
			else {
				System.out.println("Out of chances!");
				System.out.println(".............*****************************............");
			}	
		}
		else if(status==3) {
			//second round for p1 and p3
			System.out.println("next round for P1 and P3!");
			System.out.println("chances from Umpire:"+" "+chances);
			//System.out.println("chancesCount"+ " "+chancesCount);
			System.out.println("chances remaining"+ " "+(chances-chancesCount));
			System.out.println();
			if(chancesCount<chances) {
				p1Guessnum=p[0].guessnum(p1);
				
				p3Guessnum=p[2].guessnum(p3);
				validateWinner();
				
			}
			else {
				System.out.println("Out of chances!");
				System.out.println(".............*****************************............");
			}	
			
		}
		else if(status==4) {
			//second round for p2 and p3
			System.out.println("next round for P2 and P3!");
			System.out.println("chances from Umpire:"+" "+chances);
			//System.out.println("chancesCount"+ " "+chancesCount);
			System.out.println("chances remaining"+ " "+(chances-chancesCount));
			System.out.println();
			if(chancesCount<chances) {
				p2Guessnum=p[1].guessnum(p2);
				p3Guessnum=p[2].guessnum(p3);
				validateWinner();
				
			}
			else {
				System.out.println("Out of chances!");
				System.out.println(".............*****************************............");
			}	
		}
		else {
			//nothing to do
		}
			
			
			
	}
	
	
	
}





public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Umpire u = new Umpire();
		u.noOfChances();
		int winnum = u.getWinNum();
		u.getPlayerNum();
		u.validateWinner();
		System.out.println("winning number is " + winnum);
			
	

	}

}
