package partA;

import Turtle.SimpleTurtle;

public class DrunkTurtle extends SimpleTurtle {

	/** Default constructor uses SimpleTurtle constructor
	 */
	public DrunkTurtle() {
		super();
	}
	/**
	 * moving forward to a random distance between 0 to 2*distance (parameter)
	 * and than turning left with random angle between -30 to +30 
	 */
	@Override
	public void moveForward (double distance) {
		double new_dist = Math.random()*(distance*2);
		super.moveForward(new_dist);
		turnLeft((int)(Math.random()*60)-30);
	}
}
