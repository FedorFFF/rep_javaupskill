package by.epam.fh.zzzz;

/* Тест junit 4
не сильно ясно что можно для круга
для произведения более менее - хотя и для круга можно взять калькулятро и почитать пары  
*/

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.epam.fh.tsk1.Circle;
import by.epam.fh.tsk1.Circle_Formula;
import by.epam.fh.tsk1.Formula_n4;

@RunWith(Parameterized.class)
public class TestUnit {
	private int in1;
    private int out2 ;
    private int in3;
    static int raz1 = 0;
    
	//static
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		//this.test_circle_01();
	}
    
    // переопределить методы лдля разных праметров  public-конструктор с параметрами для инициализации полей
	public TestUnit (int in1, int out2 ) //, int in3)
    {
        this.in1 = in1;
        this.out2 = out2;
//        this.in3 = in3;
    }
	
	// 3 параметра
//		public TestUnit (int in1, int out2, int in3)
//    {
//        this.in1 = in1;
//        this.out2 = out2;
//        this.in3 = in3;
//    }
//	numberExamples {0123456, 0}, - прадает потому что НЕ корректное число
// 0012111 воспринимается как 5193 почему ??? 01234 как 668

	@Parameters
    public static Collection<Object[]> ex1() {
        return Arrays.asList(new Object[][]{
        	    {0, 0},
        	    {01234, 0},
        	    {1234, 24},
        	    //{1234, 24, 1}, java.lang.IllegalArgumentException: wrong number of arguments
                {1234, 24},
                {1111111111, 1},
                {1234560, 0},
                {-1111, 1},
                {1111, 1},
                {9999, 6561},
                {4726, 336}
        });
    }	
//------------------------------------------------------------------------------------------------
	@Test
	public  void test_miult_01() {
//		Assert.fail("test fail");		// Assert.assertNull("test fail", null);
		raz1 ++;
		System.out.println() ;
		int number1  ;
		 number1 = this.in1 ;
		 System.out.println("RAZ : " + raz1 + " || Number 4 (from Params): " + number1) ;
		int expected = this.out2;

		Formula_n4 Formul1 = new Formula_n4(number1);
	 // System.out.println("(Validation) Number Contains 4 figures :" + Formul1.validate_on_4_figures()) ;
		// упадут {1111111111, 1},
//		Assert.assertTrue("Not 4 figures", Formul1.validate_on_4_figures());
		
		
				// System.out.println("Multiplication of figures :  " + Formul1.calc_multiply_figures() ) ;
		int actual =Formul1.calc_multiply_figures() ;
        System.out.println("expected: " + expected + " || actual: " + actual) ;
       
        // java.lang.AssertionError: error: + 0288 expected:<0> but was:<288>
        Assert.assertEquals( "error: + " + expected + " , " +actual + "" , expected, actual);
        // Assert.assertEquals(message, expected, actual);

	}
//------------------------------------------------------------------------------------------------	
//------------------------------------------------------------------------------------------------	
	@Test
	  public  void test_circle_01() {
	    // Calculator calculator = new Calculator();
		double r1= this.in1 ; // 10 ;
		Circle c1 = new Circle( r1 );
	    Circle_Formula Formul1 = new Circle_Formula( c1 );
		    
	    System.out.println( "test :" + this.getClass().getName() ) ;
	          // System.out.println(Formul1.calc_area()  ) ;
        Formul1.calc_all() ;
        System.out.println( Formul1.circle1.area1 + " :: " + Formul1.circle1.perim1 ) ;
        double  expect_square = r1*r1*Math.PI ;
        double  expect_len = r1*2*Math.PI ;
        
        Assert.assertEquals(expect_len , Formul1.circle1.perim1 , 0.000000000001);
	    Assert.assertEquals(expect_square , Formul1.circle1.area1 , 0.000000000001);
	    System.out.println(  (expect_len == Formul1.circle1.perim1)) ;
	    System.out.println( "delta : " + (expect_len - Formul1.circle1.perim1)) ;
	    if( expect_len == Formul1.circle1.perim1)
	    		System.out.println("++ == ") ;
	    else System.out.println(" NOT == ") ;
	    		
	    Assert.assertTrue(expect_len == Formul1.circle1.perim1);
	  }

}
//------------------------------------------------------------------------------------------------	