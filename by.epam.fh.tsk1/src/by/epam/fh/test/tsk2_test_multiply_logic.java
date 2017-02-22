package by.epam.fh.test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.epam.fh.tsk1.Formula_n4;

// Проверка логики умножения цифр 4-значного числа - по заданным парам.

@RunWith(Parameterized.class)
public class tsk2_test_multiply_logic {
	private int in1;
    private int out2 ;
//    private int in3;
    static int raz1 = 0;
    
//	public static void main(String[] args) {	}
	public tsk2_test_multiply_logic (int in1, int out2 ) //, int in3)
    {
        this.in1 = in1;
        this.out2 = out2;
//        this.in3 = in3;
    }
// 	01234 как 288 8-ричная с-ма чиселния 
	
	@Parameters	
    public static Collection<Object[]> ex1() {
        return Arrays.asList(new Object[][]{
        	    {0, 0},
        	    {12340, 0},
        	    {12342, 48},
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

// ------------------------------------------------------------------------------------------------------
    @Test
	public  void test_multiply() {
		raz1 ++;
		System.out.println() ;
		int number1  ;
		 number1 = this.in1 ;
		 System.out.println("RAZ : " + raz1 + " || Number 4 (from Params): " + number1) ;
		int expected = this.out2;

		Formula_n4 Formul1 = new Formula_n4(number1);
		int actual = Formul1.calc_multiply_figures() ;
        System.out.println("expected: " + expected + " || actual: " + actual) ;
       
        // java.lang.AssertionError: error: + 0288 expected:<0> but was:<288>
        Assert.assertEquals( "error: + " + expected + " , " +actual + "" , expected, actual);
        // Assert.assertEquals(message, expected, actual);

}
 // ------------------------------------------------------------------------------------------------------
}