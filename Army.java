package partA;

import java.util.Scanner;
import Turtle.SimpleTurtle;
import Turtle.Turtle;

public class Army {

	/**creating array of 5 Turtles, the user decides the types based on a menu 
	 * @return array of 5 Turtles 
	 */
	public static Turtle [] chooseArmy() {
		Turtle [] army = new Turtle[5];
		Scanner sc = new Scanner (System.in);
		int temp;
		System.out.println("Choose the type of a turtle:\n" + 
				"1. Simple\n" + 
				"2. Smart\n" + 
				"3. Drunk\n" + 
				"4. Jumpy");

		for (int i = 0; i < 5; i++) {
			temp = sc.nextInt();
			if (temp == 1) {
				army[i] = new SimpleTurtle();
			}
			else if (temp == 2) {
				army[i] = new SmartTurtle();
			}
			else if (temp == 3) {
				army[i] = new DrunkTurtle();
			}
			else if (temp == 4) {
				army[i] = new JumpyTurtle();
			}
			else {
				System.out.println("invalid input!");
				i--;
			}
		}
		sc.close();
		return army;
	}
	/** getting array from chooseArmy function 
	 * each turtle waits until all turtles are done.
	 * only SmartTurtle and JumpyTurtle (because it inherits from SmartTurtle) can draw Polygon
	 *  use casting for SmartTurtle and JumpyTurtle for using the drawPolygon method and for move forward   
	 *  and use casting of DrunkTurtle for move forward and turnRight as asked
	 */
	public static void moveArmy() {
		Turtle [] army = chooseArmy();
		for (int i = 0; i < army.length; i++) {
			army[i].tailDown();
		}
		for (int i = 0; i < army.length; i++) {
			if (army[i] instanceof JumpyTurtle ) {
				((JumpyTurtle) army[i]).moveForward(100);
			}
			else if (army[i] instanceof DrunkTurtle ) {
				((DrunkTurtle) army[i]).moveForward(100);
			}
			else army[i].moveForward(100);
		}
		for (int i = 0; i < army.length; i++) {
			if (army[i] instanceof JumpyTurtle ) {
				((JumpyTurtle) army[i]).turnRight(90);;
			}
			else if (army[i] instanceof DrunkTurtle ) {
				((DrunkTurtle) army[i]).turnRight(90);
			}
			else army[i].turnRight(90);
		}
		for (int i = 0; i < army.length; i++) {
			if (army[i] instanceof JumpyTurtle ) {
				((JumpyTurtle) army[i]).moveForward(60);
			}
			else if (army[i] instanceof DrunkTurtle ) {
				((DrunkTurtle) army[i]).moveForward(60);
			}
			else army[i].moveForward(60);
		}
		for (int i = 0; i < army.length; i++) {
			if (army[i] instanceof JumpyTurtle ) {
				((JumpyTurtle) army[i]).drawPolygon(6, 70);
			}
			else if (army[i] instanceof SmartTurtle) {
				((SmartTurtle)army[i]).drawPolygon(6, 70);
			}
		}
		for (int i = 0; i < army.length; i++) {
			army[i].hide();
		}
	}

	public static void main(String[] args) {
		moveArmy();
	}

}
