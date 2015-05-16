public class RegularTriangle{

	//Data field
	double length;

	//no-argument
	public RegularTriangle(){
	
		length = 0;
	}

	public RegularTriangle(double length) throws IllegalArgumentException{

		setLength(length);
	}

	public void setLength(double newLength) throws IllegalArgumentException{
		
		if(newLength < 0){
			throw new IllegalArgumentException();
		}
		else{
			length = newLength;
		}
	}

	public double getLength(){

		return length;
	}

	public double getArea(){

		double area = length * length * Math.pow(3, 0.5) / 4;
		return area;
	} 

	public double getPerimeter(){

		double perimeter = length * 3;
		return perimeter;
	}
}
