public class Rectangle{

	//Data field
	double width;
	double length;

	//no-argument constructor to construct an object with default width and length
	public  Rectangle(){
	
		width = 0;
		length = 0;
	}

	//constructor to construct an object with the width and length
	public  Rectangle(double width, double length) throws IllegalArgumentException{

		setWidth(width);
		setLength(length);
	}

	//Set a new length
	public void setLength(double newLength) throws IllegalArgumentException{ 
		
		if(newLength < 0){
			throw new IllegalArgumentException();
		}
		else{
			length = newLength;
		}
	}

	//Return the length
	public double getLength(){

		return length;
	}

	//Set a new width
	public void setWidth(double newWidth) throws IllegalArgumentException{
		
		if(newWidth < 0){
			throw new IllegalArgumentException();
		}
		else{
			width = newWidth;
		}
	}

	//Return the width
	public double getWidth(){

		return width;
	}

	//Return the area
	public double getArea(){

		double area = length * width;
		return area;
	} 

	//Return the perimeter
	public double getPerimeter(){

		double perimeter = (length + width) * 2;
		return perimeter;
	}
}
