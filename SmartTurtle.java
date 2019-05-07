package partA;

import Turtle.SimpleTurtle;

public class SmartTurtle extends SimpleTurtle {

	/** Default constructor uses SimpleTurtle constructor
	 */
	public SmartTurtle() {
		super();
	}
	
	/**draw square using size parameter, moving forward 90 degrees 4 times
	 * @param size
	 */
	public void drawSquare(double size) {
		for (int i = 0; i < 4; i++) {
			moveForward(size);
			turnLeft(90);
		}
	}
	/**draw Polygon using size parameter and sides, moving forward and turning right to create shape Polygon
	 * ignoring incomplete angle as asked
	 * @param sides
	 * @param size
	 */
	public void drawPolygon (int sides, double size){
		double angle = 360.0 / sides; 
		for (int i=0; i < sides ;i++){
			moveForward(size);
			turnRight((int)angle);
		}
	}
}
