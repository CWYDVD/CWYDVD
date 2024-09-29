package assign05;

public class Rectangle {
		private int positionX;
		private int positionY;
		private int width;
		private int length;
		
		public Rectangle() {
			rectangle = new Rectangle(0,0,1,1);
		}
//
//		This constructor has no parameters and creates a new Rectangle with position (0, 0) and width = height = 1.
//		public Rectangle(int positionX, int positionY, int width, int height)
//
//		This constructor has parameters for position and sizes. It creates a new Rectangle with position (positionX, positionY) and the given width and height. Width and height are positive numbers.
//		public int getX()
//
//		This method returns the value of the x coordinate of the position of this Rectangle, which is the corner with minimum x and y values.
//		public int getY()
//
//		This method returns the value of the y coordinate of the position of this Rectangle.
//		public int getWidth()
//
//		This method returns the width of this Rectangle, which is the size in the x direction.
//		public int getHeight()
//
//		This method returns the height of this Rectangle, which is the size in the y direction.
//		public void move(int newX, int newY)
//
//		This method changes the position of this Rectangle to be (newX, newY).
//		public void scale(double xFactor, double yFactor)
//
//		This method changes the width and height of this Rectangle. The new width will be (width * xFactor). The new height will be (height * yFactor). Since width and height are ints, and the results of multiplying by the factors will be doubles, convert back to int by casting with (int). Do not round the values. You can assume that the factors will not result in a width or height that is not positive.
//		public boolean largerThan(Rectangle other)
//
//		This method compares this Rectangle with the other Rectangle to determine if this one is larger than the other. For this assignment, use area as the measurement to compare, so this Rectangle is larger than the other if the area of this is larger than the area of the other. Recall that area of a rectangle is width * height.
//		public Rectangle boundingRectangle(Rectangle other)
//
//		This method creates and returns the bounding rectangle, a new Rectangle representing the smallest rectangle that completely surrounds both this and the other Rectangle. Note the returned Rectangle is distinct from both this and the parameter other. It is a new object that needs to be created by calling a Rectangle constructor from within this method. This and the other Rectangle must not be modified by this method.
}
