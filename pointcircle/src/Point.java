//Point class
//Defines a point with coordinates px and py
public class Point {
	private double px;
	private double py;

	// constructor
	public Point(double px, double py) {
		this.px = px;
		this.py = py;
	}

	// get and set methods //
	public void setX(double px) {
		this.px = px;
	}

	public void setY(double py) {
		this.py = py;
	}

	public double getX() {
		return px;
	}

	public double getY() {
		return py;
	}
	// END OF GET SETS //
	
	// toString method
	public String toString(){
		return "[px: "+px+", py: "+py+"]";
	}
	
}