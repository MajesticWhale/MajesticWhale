	public class IvanTorres_TwelthProject {
		  private double width;
		  private double length;
		  private static int numberOfObjects = 0;

		  // no-arg constructor
		  public IvanTorres_TwelthProject() {
			  width=1.0;
			  length=1.0;
			  numberOfObjects++;
		  }
		  // constructor with parameter
		  public IvanTorres_TwelthProject(double newWidth, double newLength) {
				width = newWidth;
				length = newLength;
				numberOfObjects++;
		  }

		  /** Return Width */
		  public double getWidth() {
		    return width;
		  }
		  /** Return Length */
		  public double getLength() {
		    return length;
		  }
		  public double getnumberOfObjects() {
			    return numberOfObjects;
			  }

		  /** Set a new Width and Length */
		  public void setRadius(double newWidth, double newLength) {
		    if (newWidth>0.0)
			  this.width = newWidth;
		    else
		    	System.out.println("Width must be greater than 0");
		    if (newLength>0.0) 
				  this.length = newLength;
		    else
			    	System.out.println("Length must be greater than 0");
		  }


		  /** Return numberOfObjects */
		  public static int getNumberOfObjects() {
		    return numberOfObjects;
		  }


		  /** Return area */
		  public double getArea() {
		    return width * length;
		  }

		  /** Return one line description about each rectangle object*/
		  public String toString() 
		 { 
		 	return "The width is:" + width + ","+"\t\tThe length is:" + length +","+"\t\tThe area is:" 	+ getArea(); 
		 } 
		}



