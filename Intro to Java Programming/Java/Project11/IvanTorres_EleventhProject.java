		public class IvanTorres_EleventhProject {
			  private double width;
			  private double length;
			  // no-arg constructor
			  public IvanTorres_EleventhProject() {
				  width=0.0;
				  length=0.0;
			  }
			  // constructor with parameter
			  public IvanTorres_EleventhProject(double newWidth, double newLength) {
					width = newWidth;
					length = newLength;

			  }

			  /** Return Width */
			  public double getWidth() {
			    return width;
			  }
			  /** Return Length */
			  public double getLength() {
			    return length;
			  }


			  /** Set a new Width and Length */
			  public void setRadius(double newWidth, double newLength) {
			    if (newWidth>0.0)
				  this.width = newWidth;
			    else
			    	System.out.println("Width must be greater than 0");
			    if (newLength>0.0)
					  this.width = newLength;
				    else
				    	System.out.println("Length must be greater than 0");
			  }

			  /** Return area */
			  public double getArea() {
			    return width * length;
			  }

			  /** Return perimeter */
			  public double getPerimeter() {
			    return 2 * (length + width);
			  }
	
	}
