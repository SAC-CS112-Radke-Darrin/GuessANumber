import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		int compNum;
		int usrNum;
		int count = 1;
		
		while (count <= 3){
			count++;
			compNum = 1 + (int)(Math.random()*10);
			System.out.println("Guess a number between 1 & 10.");
			usrNum = inp.nextInt();
			if (usrNum > compNum){
				System.out.println("Too big.");}
			else if (usrNum < compNum){
				System.out.println("Too small.");}
			else
				System.out.println("Match.");}
		
		System.out.println("End.");
		
		inp.close();
		}

}
