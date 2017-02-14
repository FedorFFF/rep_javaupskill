package by.epam.fh.tsk1;
/* < F.Hulin,  09.02.2017> Класс круг
*/

// NOT abstract - otherwise it can'be inherited
public  class Circle extends Shape {
    // private final double radius;
	public  double radius;
	public  double area1;
	public  double perim1;
	
	public double getArea1() {
		return area1;
	}
	public void setArea1(double area1) {
		this.area1 = area1;
	}
	public double getPerim1() {
		return perim1;
	}
	public void setPerim1(double perim1) {
		this.perim1 = perim1;
	}
	
	 public void setRadius(double radius) {
		this.radius = radius;
	}
	//----------------------------------------------------------------	
    public double getRadius() {
		return radius;
	}
	// type_shape = 'Circle';
 //----------------------------------------------------------------
    public Circle() {
        this(1);
    }   
  //----------------------------------------------------------------    
    public Circle(double radius) {
        this.radius = radius;
    }

}