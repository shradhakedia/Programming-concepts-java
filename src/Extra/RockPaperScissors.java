package Extra;

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
	public static void main(String[] args){
		int c,p;
		int i = 1;
		int cscore=0,pscore=0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Enter 0 for Paper\nEnter 1 for Stone\nEnter 2 for Scissors");
		while(i<=5){
			System.out.println("Round"+i+":\nEnter your Choice:");
			p = sc.nextInt();
			c = rd.nextInt(3);
			if(p==0){
				if(c==0){
					System.out.println("Round "+i+" is Tie");
				}
				else if(c==1){
					System.out.println("You won round "+i);
					pscore+=1;
				}
				else if(c==2){
					System.out.println("You lost round "+i);
					cscore+=1;
				}
				System.out.println("You Entered:"+p+"\nComputer Entered:"+c);
			}
			else if(p==1){
				if(c==1){
					System.out.println("Round "+i+" is Tie");
				}
				else if(c==2){
					System.out.println("You won round "+i);
					pscore+=1;
				}
				else if(c==0){
					System.out.println("You lost round "+i);
					cscore+=1;
				}
				System.out.println("You Entered:"+p+"\nComputer Entered:"+c);
			}
			else if(p==2){
				if(c==2){
					System.out.println("Round "+i+" is Tie");
				}
				else if(c==0){
					System.out.println("You won round "+i);
					pscore+=1;
				}
				else if(c==1){
					System.out.println("You lost round "+i);
					cscore+=1;
				}
				System.out.println("You Entered:"+p+"\nComputer Entered:"+c);
			}
			else{
				System.out.println("Wrong Input");
				System.out.println("You Entered:"+p+"\nComputer Entered:"+c);
			}
			i++;
		}
		if(cscore>pscore){
			System.out.println("You Lost The Game\nYour Score: "+pscore+"\nComputer score: " +cscore);
		}
		else if(pscore>cscore){
			System.out.println("You Won The Game\nYour Score: "+pscore+"\nComputer score: " +cscore);
		}
		else{
			System.out.println("Its a Tie\nYour Score: "+pscore+"\nComputer score: " +cscore);
		}
	}
}