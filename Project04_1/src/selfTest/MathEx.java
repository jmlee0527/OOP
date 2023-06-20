
package selfTest;


public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 60984;
		int b = 808;
		
		double x = 2.0;
		double y = 3.0;
		double r;
		
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        double xy = Math.pow(x, y);
        double yx = Math.pow(y, x);
 
		
		r = Math.random() * 10;
	    double circle = Math.PI * Math.pow(r, 2);
		
		System.out.println("Maximum: " + max);
		System.out.println("Mininum: " + min);
		System.out.println("x^y: " + xy);
		System.out.println("y^x: " + yx);
		System.out.println("Radius: " + r);
		System.out.println("Circle area: " + circle);
		
	}

}
