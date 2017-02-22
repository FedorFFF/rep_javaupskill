package by.epam.fh.tsk1;

/* < F.Hulin,  09.02.2017>
	Вычисление формул :  произведение цифр числа 
	отдельным классом - чтобы возможно еще какие-то формулы впихнуть 
*/
public class Formula_n4 
{
	// public final int number1 ;
	public int number1 ;
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	//----------------------------------------------------------------    
    public Formula_n4(int number1) {
        this.number1 = number1;
    }
	//----------------------------------------------------------------    	
    public int calc_multiply_figures() 
	{
		String c1 ;
		String s1 = Integer.toString(number1);   //		String s2 = String.valueOf(number1);
		
		int  mult1=1  ; 
		for(int i=0; i<= s1.length() - 1 ; i++)
		{
            // System.out.println("Count is: " + i); endindex
            c1 = s1.substring( i, i+1 ) ; // (int beginIndex, int endIndex) - i,i+1
            // System.out.print(c1 + "; ");
			// проверка на минус - минус игнорируем.
            if ( !c1.equals("-") ) 
					mult1 = mult1*Integer.parseInt(c1);
        }
		// System.out.println("mult :" + mult1);
		return mult1 ;
    }
	//----------------------------------------------------------------    	
    public int calc_sum_figures() 
	{
		String c1 ;
		String s1 = Integer.toString(number1);   //		String s2 = String.valueOf(number1);
		
		int  sum1=0  ; 
		for(int i=0; i<= s1.length() - 1 ; i++)
		{
            // System.out.println("Count is: " + i); endindex
            c1 = s1.substring( i, i+1 ) ; // (int beginIndex, int endIndex) - i,i+1
            // System.out.print(c1 + "; ");
			// проверка на минус - минус игнорируем.
            if ( !c1.equals("-") ) 
            	sum1 = sum1 + Integer.parseInt(c1);
        }
		// System.out.println("mult :" + mult1);
		return sum1 ;
    }
	//----------------------------------------------------------------
    
	//----------------------------------------------------------------
    public boolean  validate_on_4_figures() 
	{
    	
    	if ( Math.abs(number1) <=9999 )
    			return true ;
    	else 
    				return false ;
	}
	//----------------------------------------------------------------
}
