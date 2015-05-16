public class Circle{

	//Data field
	double radius;

	//no-argument constructor to construct an object with default radius
	public Circle(){
	
		radius = 0;
	}

	//constructor to construct an object with the radius
	public Circle(double radius) throws IllegalArgumentException{

		setRadius(radius);
	}

	//Set new radius
	public void setRadius(double newRadius) throws IllegalArgumentException{
		
		if(newRadius < 0){
			throw new IllegalArgumentException();
		}
		else{
			radius = newRadius;
		}
	}

	//Return the radius
	public double getRadius(){

		return radius;
	}

	//Return the area 
	public double getArea(){

		double area = radius * radius * Math.PI;
		return area;
	} 

	//Return the perimeter
	public double getPerimeter(){

		double perimeter = radius * 2 * Math.PI;
		return perimeter;
	}
}
