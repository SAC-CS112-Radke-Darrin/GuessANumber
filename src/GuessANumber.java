import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int computerNum;
		int userNum;
		String response;
		
		computerNum = 1+(int)(Math.random()*10);
		
		System.out.print("Guess a number between 1 & 10: ");
		
		userNum = input.nextInt();
		
		response = (userNum == computerNum) ? "Good guess!" : "Wrong.";
		
		System.out.println(response);
		
		input.close();
		
	}

}
