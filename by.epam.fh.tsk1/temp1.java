package by.epam.fh.tsk1;

/* < F.Hulin,  09.02.2017>
	Вычисление формул :  произведение цифр числа 
	отдельным классом - чтобы возможно еще какие-то формулы впихнуть 
*/
public class Formula 
{
	public final int number1 ;
	//----------------------------------------------------------------    
    public Formula(int number1) {
        this.number1 = number1;
    }
	//----------------------------------------------------------------    	
    public int calc_multiply_figures() 
	{
		String c1 ;
		String s1 = Integer.toString(number1);   //		String s2 = String.valueOf(number1);
		int  mult1 = 1  ; 
		
		for(int i=0; i<= s1.length() - 1 ; i++)
		{
            // System.out.println("Count is: " + i); endindex
            c1 = s1.substring( i, i+1 ) ;
            // System.out.print(c1 + "; ");
			// проверка на минус - минус игнорируем.
            if ( !c1.equals("-") ) 
					mult1 = mult1*Integer.parseInt(c1);
        }
		// System.out.println("mult :" + mult1);
		return mult1 ;
    }
	//----------------------------------------------------------------    	
}
