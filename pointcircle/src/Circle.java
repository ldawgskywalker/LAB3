public class Circle {
	// instance variables
	private double cx;
	private double cy;
	private double radius;

	// constructor
	public Circle(double cx, double cy, double radius) {
		this.cx = cx;
		this.cy = cy;
		this.radius = radius;
	}

	// get and set methods
	public void setCX(double cx) {
		this.cx = cx;
	}

	public void setCY(double cy) {
		this.cy = cy;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCX() {
		return cx;
	}

	public double getCY() {
		return cy;
	}

	public double getRadius() {
		return radius;
	}
	// END OF GET SETS //

	// toString method
	public String toString() {
		return "Circle with center " + cx + "," + cy + " and radius " + radius;
	}

	// enclose method (illustrates object interactions)
	// checks if a point is enclosed within the circle
	// Algorithm: A point px,py is enclosed in a circle if the distance from
	// the point to the center cx,cy of the circle is less than the radius
	public boolean encloses(Point p) {
		double d;
		d = Math.sqrt(((p.getX() - cx) * (p.getX() - cx)) + ((p.getY() - cy) * (p.getY() - cy)));
		if (d < radius)
			return true;
		else
			return false;
	}

	public boolean touches(Circle c) {

		if (c.getCX() == cx + radius + c.getRadius())
			return true;
		if (cx == c.getCX() + radius + c.getRadius())
			return true;

		return false;
	}
}
