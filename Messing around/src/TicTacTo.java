import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacTo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		boolean xIn1Spot = false;
		boolean xIn2Spot = false;
		boolean xIn3Spot = false;
	    boolean xIn4Spot = false;
	    boolean xIn5Spot = false;
	    boolean xIn6Spot = false;
	    boolean xIn7Spot = false;
	    boolean xIn8Spot = false;
	    boolean xIn9Spot = false;
	    boolean oIn1Spot = false;
		boolean oIn2Spot = false;
		boolean oIn3Spot = false;
	    boolean oIn4Spot = false;
	    boolean oIn5Spot = false;
	    boolean oIn6Spot = false;
	    boolean oIn7Spot = false;
	    boolean oIn8Spot = false;
	    boolean oIn9Spot = false;
	    boolean secondForLoop = false;
	    boolean playerTurn = true;
	    
		for (int i = 0; i < 9; i++) {
			System.out.println("Where do you want to play?");
			String input = reader.readLine();
			int min = 1;
			int max = 9;
			
		    int random_int = (int)(Math.random() * (max - min + 1) + min);
		    System.out.println(random_int);

		    
			if (input.contains("1") && playerTurn == false && xIn1Spot == false) {
				oIn1Spot = true;
				playerTurn = true;
			}
			if (input.contains("2") && playerTurn == false && xIn2Spot == false) {
				oIn2Spot = true;
				playerTurn = true;
			}
			if (input.contains("3") && playerTurn == false && xIn3Spot == false) {
				oIn3Spot = true;
				playerTurn = false;
			}
			if (input.contains("4") && playerTurn == false && xIn4Spot == false) {
				oIn4Spot = true;
				playerTurn = true;
			}
			if (input.contains("5") && playerTurn == false && xIn5Spot == false) {
				oIn5Spot = true;
				playerTurn = true;
			}
			if (input.contains("6") && playerTurn == false && xIn6Spot == false) {
				oIn6Spot = true;
				playerTurn = true;
			}
			if (input.contains("7") && playerTurn == false && xIn7Spot == false) {
				oIn7Spot = true;
				playerTurn = true;
			}
			if (input.contains("8") && playerTurn == false && xIn8Spot == false) {
				oIn8Spot = true;
				playerTurn = true;
			}
			if (input.contains("9") && playerTurn == false && xIn9Spot == false) {
				oIn9Spot = true;
				playerTurn = true;
			}
			if (input.contains("1") && playerTurn == true && oIn1Spot == false) {
				xIn1Spot = true;
				playerTurn = false;
			}
			if (input.contains("2") && playerTurn == true && oIn2Spot == false) {
				xIn2Spot = true;
				playerTurn = false;
			}
			if (input.contains("3") && playerTurn == true && oIn3Spot == false) {
				xIn3Spot = true;
				playerTurn = false;
			}
			if (input.contains("4") && playerTurn == true && oIn4Spot == false) {
				xIn4Spot = true;
				playerTurn = false;
			}
			if (input.contains("5") && playerTurn == true && oIn5Spot == false) {
				xIn5Spot = true;
				playerTurn = false;
			}
			if (input.contains("6") && playerTurn == true && oIn6Spot == false) {
				xIn6Spot = true;
				playerTurn = false;
			}
			if (input.contains("7") && playerTurn == true && oIn7Spot == false) {
				xIn7Spot = true;
				playerTurn = false;
			}
			if (input.contains("8") && playerTurn == true && oIn8Spot == false) {
				xIn8Spot = true;
				playerTurn = false;
			}
			if (input.contains("9") && playerTurn == true && oIn9Spot == false) {
				xIn9Spot = true;
				playerTurn = false;
			}
			if (i >= 8) {
				secondForLoop = true;
			}
			if(secondForLoop = true)
	    	if (xIn1Spot == true) {
				System.out.print("x");
			}
			if (xIn2Spot == true) {
				System.out.print("x");
			}
			if (xIn3Spot == true) {
				System.out.println("x");
			}
			if (xIn4Spot == true) {
				System.out.print("x");
			}
			if (xIn5Spot == true) {
				System.out.print("x");
			}
			if (xIn6Spot == true) {
				System.out.println("x");
			}
			if (xIn7Spot == true) {
				System.out.print("x");
			}
			if (xIn8Spot == true) {
				System.out.print("x");
			}
			if (xIn9Spot == true) {
				System.out.print("x");
			}
		    
			}
			if (oIn1Spot == true) {
				System.out.print("o");
			}
			if (oIn2Spot == true) {
				System.out.print("o");
			}
			if (oIn3Spot == true) {
				System.out.println("o");
			}
			if (oIn4Spot == true) {
				System.out.print("o");
			}
			if (oIn5Spot == true) {
				System.out.print("o");
			}
			if (oIn6Spot == true) {
				System.out.println("o");
			}
			if (oIn7Spot == true) {
				System.out.print("o");
			}
			if (oIn8Spot == true) {
				System.out.print("o");
			}
			if (oIn9Spot == true) {
				System.out.print("o");
			}
		    
	}
		    
	}


