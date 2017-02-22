package by.epam.fh.test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.epam.fh.tsk1.Formula_n4;

//Проверка то что число  4-значное - по заданным парам.
@RunWith(Parameterized.class)
public class tsk2_test_number_validation {

	private int in1;
    private boolean out2 ;
    // private int in3;
    static int raz1 = 0;
        
    // переопределить методы лдля разных праметров  public-конструктор с параметрами для инициализации полей
	public tsk2_test_number_validation (int in1, boolean out2 ) //, int in3)
    {
        this.in1 = in1;
        this.out2 = out2;
//        this.in3 = in3;
    }
	// 0, true
	@Parameters
    public static Collection<Object[]> ex1() {
        return Arrays.asList(new Object[][]{
        	    {0, true},
        	    {1234, true},
        	    {-1234, true},
        	    {-123, true},
        	    {-123, true},
        	    {-123, true},
        	    {54321, false},
        	    {-54321, false},
        	    //{1234, 24, 1}, java.lang.IllegalArgumentException: wrong number of arguments
        });
    }	

    @Test
	public  void test_multiply() {
		raz1 ++;
		System.out.println() ;
		int number1  ;
		 number1 = this.in1 ;
		 System.out.println("RAZ : " + raz1 + " || Number 4 (from Params): " + number1) ;
		 boolean expected = this.out2;

		Formula_n4 Formul1 = new Formula_n4(number1);
		boolean actual = Formul1.validate_on_4_figures() ;
        System.out.println("expected: " + expected + " || actual: " + actual) ;
       
        Assert.assertEquals( "error: + " + expected + " , " +actual + "" , expected, actual);

}
}
