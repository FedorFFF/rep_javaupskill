package by.epam.fh.test;

import org.junit.Assert;
import org.junit.Test;

import by.epam.fh.tsk1.Circle;
import by.epam.fh.tsk1.Circle_Formula;

// Проверка круга - делаю ТЕ ЖЕ вычисления 
// по идее можно посчитать на калькуляторе - но тогда не ясно какую точность в дельте задавать ??

public class tsk1_test_circle_logic {

	//------------------------------------------------------------------------------------------------	
		@Test
		  public  void test_circle_01() {
 
			double r1=  10.1 ; // this.in1 ; // 10 ;
			Circle c1 = new Circle( r1 );
		    Circle_Formula Formul1 = new Circle_Formula( c1 );
			    
		    System.out.println( "test :" + this.getClass().getName() ) ;
		          // System.out.println(Formul1.calc_area()  ) ;
	        Formul1.calc_all() ;
	        System.out.println( "Radius: " +  r1 + " :: " + Formul1.circle1.area1 + " :: " + Formul1.circle1.perim1 ) ;
	        double  expect_square = r1*r1*Math.PI ;
	        double  expect_len    = r1*2*Math.PI ;

		    System.out.println(  (expect_len == Formul1.circle1.perim1)) ;
		    System.out.println( "delta : " + (expect_len - Formul1.circle1.perim1)) ;

	        Assert.assertEquals(expect_len , Formul1.circle1.perim1 , 0.000000000001);
		    Assert.assertEquals(expect_square , Formul1.circle1.area1 , 0.000000000001);
		    
		    
		    if( expect_len == Formul1.circle1.perim1) 	System.out.println("Perimetr == ") ;
		    	else System.out.println(" NOT Perimetr == ") ;
		    		
		    	Assert.assertTrue(expect_len == Formul1.circle1.perim1);
		    	
		  }

}
