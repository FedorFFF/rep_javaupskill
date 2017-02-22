package by.epam.fh.tsk1;

//import by.epam.fh.tsk1.* ;
import by.epam.fh.tsk1.Circle ;
import by.epam.fh.tsk1.Input ;

/* < F.Hulin,  09.02.2017>
Task1_02  Вычисление произведения цифр 4-значного числа 
*/

public class Run_circle {
	
	// 1 from file , 2 from keyboard , 3 default 
	public static int input_type = 3   ; 
	public static void main(String[] args) {
		// надо прочитать из потока или файла или взять дефолтное значение 
        double radius1 = 2.1;
		
        Input input1 = new Input();
        
        switch (input_type) 
        {
        case 1:  radius1 = input1.input_radius_file() ;
                 break;
                 
        case 2:  radius1 = input1.input_radius_keyboard() ;
                 break;

        case 3:  radius1 = input1.input_radius_default() ;
        		break;

        }         
		// System.out.println( input1.toString()) ;
        if ( radius1 == input1.BAD_DATA_IN_FILE ) // -1  
        		{
        			// System.out.println("Incorrect (Not numeric) value in file " ) ;
        			return ;
        		}
        
        Circle circle1 = new Circle(radius1);
        // System.out.println( circle1.getRadius()) ;
        
        Circle_Formula Formul1 = new Circle_Formula( circle1 );
        // System.out.println(Formul1.calc_area()  ) ;
        
        Formul1.calc_all() ;
        System.out.println( Formul1.circle1.area1 + " :: " + Formul1.circle1.perim1 ) ;
        
/*      circle1.setRadius (20);    
        Formul1.calc_all() ;
        System.out.println( Formul1.circle1.area1 + " :: " + Formul1.circle1.perim1 ) ;
System.out.println(Formul1.circle1.radius) ;
        		// circle1.getRadius()) ;       
System.out.println(Formul1.circle1.getRadius()) ;
Formul1.calc_perimeter()
System.out.println("Circle radius: " + radius1     + "\n Area: " + Formul1.calc_area()    + "\n Perimeter: " + Formul1.calc_perimeter() + "\n");
*/
	 
     Output output1 = new Output();
     
	 output1.output_radius_file( "" , radius1, Formul1.circle1.area1 , Formul1.circle1.perim1 );
	 System.out.println( "Вывод результата в текст.файл :" + output1.file_out ) ;


// static
//	Circle.calc_all();
	}
}

