public class CircleWithPrivateDataFields {
  /** The radius of the circle */
  private double radius;

  /** The number of the objects created */
  private static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public CircleWithPrivateDataFields() {
    radius = 1;
    numberOfObjects++;
  }

  /** Construct a circle with a specified radius */
  public CircleWithPrivateDataFields(double newRadius) {
	if (newRadius > 0) {
    		radius = newRadius;
    		numberOfObjects++
	}
	else {
	  //System.out...
	}
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  /** Return the area of this circle */
  public double getArea() {
    return radius * radius * Math.PI;
  }
 
 /** Return one line description about each circle object*/
  public String toString() 
 { 
 	return "The radius is:" + this.radius+","+"The area is:" 	+this.getArea()”; 
 } 
}
