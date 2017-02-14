package by.epam.fh.tsk1;

import by.epam.fh.tsk1.Input ;

/* < F.Hulin,  09.02.2017>
Task1_02  Вычисление произведения цифр 4-значного числа 
*/

public class Run_multiply_figures {

	public Run_multiply_figures() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	// 1 from file , 2 from keyboard , 3 default 
	int input_type = 1   ; 
		// надо прочитать из потока или файла или взять дефолтное значение 
        int number1 = 0;
		
        Input input1 = new Input();
        
        switch (input_type) 
        {
        case 1:  number1 = (int) input1.input_n4_file() ; // (int)
                 break;
                 
        case 2:  number1 = input1.input_n4_keyboard() ;
                 break;

        case 3:  number1 = input1.input_n4_default() ;
        		break;

        }         
		// System.out.println( input1.toString()) ;
        if ( number1 ==  input1.BAD_DATA_IN_FILE ) // -1  
        		{
        			// System.out.println("Incorrect value in file " ) ;
        			return ;
        		}
        Formula_n4 Formul1 = new Formula_n4(number1);
        
        
        System.out.println("(Validation) Number Contains 4 figures :" + Formul1.validate_on_4_figures()) ;
        // можно продолжать в методе и минус обрабатывается и любое число.
        
		
		System.out.println("Number 4 : " + number1) ;
		System.out.println("Multiplication of figures :  " + Formul1.calc_multiply_figures() ) ;
		
		number1 = -987654321 ;
		Formul1.setNumber1 ( number1 );
		System.out.println("Multiplication of figures :  " + Formul1.calc_multiply_figures() 
		+ "\nSum of figures :" + Formul1.calc_sum_figures()	) ;
		
		//----------------------------------------------------------------
	     Output output1 = new Output();
	     
		 output1.output_n4_file("" , number1, Formul1.calc_multiply_figures() , Formul1.calc_sum_figures() );
		 //output1.output_n4_file("" , number1, Formul1.calc_multiply_figures() , -1 );
		 System.out.println( "Вывод результата в текст.файл :" + output1.file_out ) ;
				
	}
}
