package assign05;

public class Rectangle {
		private int positionX;
		private int positionY;
		private int width;
		private int height;
		
		public Rectangle() {
			this.positionX = 0;
	        this.positionY = 0;
	        this.width = 1;
	        this.height = 1;
		}

//		Assume width and height are positive numbers.
		public Rectangle(int positionX, int positionY, int width, int height){

			this.positionX = positionX;
			this.positionY = positionY;
			this.width = width;
			this.height = height;
		}
		public int getX(){
//		This method returns the value of the x coordinate of the position of this Rectangle, which is the corner with minimum x and y values.
		return positionX;
		}
			
		public int getY(){
//		This method returns the value of the y coordinate of the position of this Rectangle.
			return positionY;
		}

//		This method returns the width of this Rectangle, which is the size in the x direction.
		public int getWidth() {
			return width;
		}
		
//		This method returns the height of this Rectangle, which is the size in the y direction.
		public int getHeight() {
			return height;
		}

//		This method changes the position of this Rectangle to be (newX, newY).
		public void move(int newX, int newY){
			positionX = newX;
			positionY = newY;
		}

//		This method changes the width and height of this Rectangle. The new width will be (width * xFactor). 
//		The new height will be (height * yFactor). Since width and height are ints, and the results 
//		of multiplying by the factors will be doubles, convert back to int by casting with (int). 
//		Do not round the values. You can assume that the factors will not result in a width or height
//		that is not positive.
		public void scale(double xFactor, double yFactor){
			width = (int) (width * xFactor);
			height = (int) (height * yFactor);
			
		}

//		This method compares this Rectangle with the other Rectangle to determine if this one is larger 
//		than the other. For this assignment, use area as the measurement to compare, so this Rectangle is 
//		larger than the other if the area of this is larger than the area of the other. Recall that area of 
//		a rectangle is width * height.
		public boolean largerThan(Rectangle other){
			int thisRecArea = width*height;
			int otherRecArea = other.width*other.height;
			return thisRecArea > otherRecArea;
		}

//		This method creates and returns the bounding rectangle, a new Rectangle representing the smallest 
//		rectangle that completely surrounds both this and the other Rectangle. Note the returned Rectangle 
//		is distinct from both this and the parameter other. It is a new object that needs to be created by 
//		calling a Rectangle constructor from within this method. This and the other Rectangle must not be 
//		modified by this method.
		public Rectangle boundingRectangle(Rectangle other) {
			// Finding the starting lower-left corer of (x,y) position for bounding rectangle
			int lowRightBoundingX = Math.min(this.positionX, other.positionX);
			int lowRightBoundingY = Math.min(this.positionY, other.positionY);
			
			// Finding the starting upright corner of  (x,y) position for bounding rectangle
			int upRightCorerThisX = this.positionX + width;
			int upRightCorerThisY = this.positionY + height;
			int upRightCorerOtherX = other.positionX + other.width;
			int upRightCorerOtherY = other.positionY + other.height;
			
			int upRightCorerBoundingX = Math.max(upRightCorerThisX, upRightCorerOtherX);
			int upRightCorerBoundingY = Math.max(upRightCorerThisY, upRightCorerOtherY);
			
			// Finding the width and height for bounding rectangle
			int boundingWidth = upRightCorerBoundingX - lowRightBoundingX;
			int boundingHeight = upRightCorerBoundingY - lowRightBoundingY;
			
			return new Rectangle(lowRightBoundingX, lowRightBoundingY, boundingWidth, boundingHeight);
		}
		
		public String toString() {
			return width + " x " + height + " " + " rectangle at" + " " + "( " + positionX + 
																		", "+ positionY + ")"; 
		}


}
