// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 2 - 02/25/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422 

package class2;

class Point {
	private double x;
	private double y;
	
	public Point(int i, int j) {
		setX(i);
		setY(j);
	}
	
	public double getX(){
		return x;
	}
	
	public void setX(int i) {
		x = i;
	}
	
	public void setY(int j) {
		y = j;
	}
	
	public double getY(){
		return y;
	}
	
	public double vectorNorm() {
		return euclidianNorm(this, this);
	}
	
	public static Boolean equals(Point a, Point b) {
		if(a.getX() == b.getX() && a.getY() == b.getY()) {
			return true;
		} else { 
			return false;
		}
	}
	
	public static double euclidianDistance(Point a, Point b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}
	
	public static double euclidianNorm(Point a, Point b) {
		return Math.sqrt(euclidianInnerProduct(a, b));
	}
	
	public static double euclidianInnerProduct(Point a, Point b) {
		return (a.getX()*b.getX() + a.getY()*b.getY());
	}
	
	public static Boolean hasTriangularInequality(Point a, Point b) {
		if(euclidianInnerProduct(a, b) <= a.vectorNorm() + b.vectorNorm()) { 
			return true; 
		} else { 
			return false; 
		}
	}
}


public class PointsInPlane {
	public static void main(String[] args) {
		Point a = new Point(2,2);
		Point b = new Point(6,6);
		Point c = new Point(1,0);
		Point d = new Point(-1,-1);
		Point e = new Point(0,6);
		
		testPointsInPlane(a, b);
		testPointsInPlane(c, b);
		testPointsInPlane(e, d);
		testPointsInPlane(e, a);
		testPointsInPlane(b, e);
	}
	
	public static void testPointsInPlane(Point a, Point b) {
		System.out.println("Point A (" + a.getX() + ", " + a.getY() + ")");
		System.out.println("Point B (" + b.getX() + ", " + b.getY() + ")\n");
		
		if(Point.equals(a, b)) {
			System.out.println("The points are the same!");
		} else {
			System.out.println("The points are not the same!");
		}
		
		System.out.println("Euclidian distance : " + Point.euclidianDistance(a, b));
		System.out.println("Euclidian Norm : " + Point.euclidianNorm(a, b));
		System.out.println("Euclidian Inner Product : " + Point.euclidianInnerProduct(a, b));
		System.out.println("Euclidian Distance : " + Point.euclidianDistance(a, b));
		
		if(Point.hasTriangularInequality(a, b)) {
			System.out.println("Has triangular Inequality");
		} else {
			System.out.println("Hasn't triangular Inequality");
		}
		System.out.println("----------------------------------\n");
	}
}
