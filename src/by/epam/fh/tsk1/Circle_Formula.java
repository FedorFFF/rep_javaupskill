package by.epam.fh.tsk1;

public class Circle_Formula {
    final double pi = Math.PI;
    public Circle circle1 ; // = new Circle(radius1);
    // public double area1 ;     public double perimeter1 ;
    
    // 
    public Circle_Formula(Circle circle1) 
    {
    	this.circle1 = circle1   ;
    	// А не наооборот - присваиваем переданное значение в свойство этого класса.
	}
	public Circle getCircle1() {
		return circle1;
	}
	public void setCircle1(Circle circle1) {
		this.circle1 = circle1;
	}
	//----------------------------------------------------------------
    public double calc_area()  
    {      
        return pi * Math.pow( circle1.radius, 2); // A = π r^2
        // this.circle1.getRadius()
        // return pi * Math.pow( this.circle1.getRadius(), 2); // A = π r^2
    }
	//----------------------------------------------------------------    
    public double calc_perimeter() 
    {
        // return 2 * pi * this.circle1.radius;   // P = 2πr
        return 2 * pi * circle1.radius;   // P = 2πr
        // return 2 * pi * this.circle1.getRadius(); 
    }
	//----------------------------------------------------------------    
    public void calc_all() 
    {
    	circle1.area1 = calc_area() ;
    	circle1.perim1 = calc_perimeter()  ;		
    }
    
/*    
  public double getArea1() {
		return area1;
	}
	public void setArea1(double area1) {
		this.area1 = area1;
	}
    public void calc_all() {
    	area1 = calc_area();
    	perimeter1 = calc_perimeter();
    }
*/	
	//----------------------------------------------------------------
  //----------------------------------------------------------------

}
