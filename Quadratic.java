package partB;

import java.util.Scanner;

public class Quadratic {
	double x1;
	double x2;
	
	/**
	 * this function gets input from user and sends to Quadratic_cal to get values for arguments x1, x2 
	 * while loop for keep getting a,b,c from user 
	 * if user enters any number except 1 the while loop stops
	 */
	public void Quadratic() {
		Scanner sc = new Scanner (System.in);
		int  temp=1;
		double a = 0, b=0, c=0;
		while (temp ==1) {
			System.out.println("aX^2+bX+c=0: Enter a,b,c: ");
			System.out.print("Enter a: ");
			a = sc.nextDouble();			
			System.out.print("Enter b: ");
			b = sc.nextDouble();
			System.out.print("Enter c: ");
			c = sc.nextDouble();
			System.out.println(a+ "X^2+" +b+ "X+" +c+ "=0:");
			Quadratic_cal(a, b, c);
			System.out.println("Enter 0 or any number to Exit or 1 to solve aX^2+bX+c=0: ");
			temp = sc.nextInt();
			if (temp != 1) {
				System.out.println("Bye-bye!");
			}
		}
	}
	/**
	 * calculates Quadratic and throws exception if: the root is negative, if a=b=c=0, if a=b=0 and c!= 0.
	 * else it solves the Quadratic and put the answer in arguments x1, x2 .
	 * prints answers to screen for the user
	 * @param a
	 * @param b
	 * @param c
	 */
	public void Quadratic_cal(double a, double b, double c) {
		double root;
		if(a!= 0) {
			try {
				root = (b*b - 4*a*c);
				if(root < 0) {
					throw new SquareEquationException("Error: NO real roots!");
				}
				if(c==0 && b!=0) {
					x1 = 0;
					x2 = (-b/a);
					System.out.println("x1= 0, x2= " + (-b/a));
				}
				else if(b!= 0) {
					x1 = (-b + Math.sqrt(root))/(2*a);
					x2 = (-b - Math.sqrt(root))/(2*a);

					if (x1 == x2) {
						System.out.println("x1=x2=" + x1);
					} else {

						System.out.println("x1= " + x1 + ", " + "x2= " + x2);
					}
				}
				else {//b==0
					x1 = Math.sqrt(-c/a);
					if(x1 == 0) {
						x1 = x2 = -x1;
						System.out.println("x1=x2= " + x1);
					}
					else {
						x2 = -x1;
						System.out.println("x1= " + x1 + ", " + "x2= " + x2);
					}
				}
			} catch (SquareEquationException e) {
				e.printStackTrace();
			}
		}
		else{
			try {
				if(b==0) { 
					if(c==0) {//a=0 && b=0 && c=0
						throw new SquareEquationException("x can be any number - trivial!");
					}
					else //a=0 && b=0 && c!=0
						throw new SquareEquationException("Error, no answer!!");
				}
				else { //a=0, b!=0
					if(c!=0) {
						x1 = x2 = -c/b;
						System.out.println("x1=x2= " + x1);
					}
				}
			}catch (SquareEquationException e) {
				e.printStackTrace();
			}
		
		}
	}
	/*
	public static void main(String[] args) {
		Quadratic test = new Quadratic();
		test.Quadratic();
	}
*/
}
