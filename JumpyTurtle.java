package partA;

public class JumpyTurtle extends SmartTurtle{

	boolean tail_status;

	/** Default constructor uses SmartTurtle constructor
	 */
	public JumpyTurtle() {
		super();
	}

	/**
	 * if the tail is up - i don't want to draw a line
	 */
	public void tailUp(){
		super.tailUp();
		tail_status = true;
	}
	/**
	 * if the tail is down - i want to draw a broken line
	 */
	public void tailDown(){
		super.tailDown();
		tail_status = false;
	}
	/**
	 * if the tail is up - draw a broken line, sending 5 as distance for moveForward each time with tailUp and than tailDown. 
	 * if the tail is down - sending distance to super moveForward (moves without any line)
	 */
	@Override
	public void moveForward (double distance) {
		double temp=distance;
		if (tail_status== false) {// i need to draw a broken line
			while(temp>0){
				tailUp();
				super.moveForward(5);
				tailDown();
				super.moveForward(5);
				temp=temp-10;
			}
		}
		else 
			super.moveForward(distance);
	}

}
