package by.epam.fh.tsk1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*  < F.Hulin,  09.02.2017>
 input from keyboard or read from file 
 		data\src_radius.txt  for Radius     (double)
		data\src_number4.txt for number4    (int)
		So I need  different methods
*/
public class Input {
	
	public static final int BAD_DATA_IN_FILE = -1;
	
	public static final String FILE_NUMBER4_PATH = "data/src_number4.txt" ; // "c://file.txt";
	public static final String FILE_RADIUS_PATH  = "data/src_radius.txt" ; 
	public Input() {
		// TODO Auto-generated constructor stub
	}
//----------------------------------------------------------------
	// Radius from file
    public double input_radius_file() 
    {
		Scanner sc1 = null;
		String file1 = FILE_RADIUS_PATH ;
		try { 			
			sc1 = new Scanner(new File( file1 )); 			
			} 
		catch (FileNotFoundException e) 
			{
			//e.printStackTrace();
			System.out.printf(e.toString());
			}
			
		double d1 ;
		// String s1 = sc1.next();
		if ( sc1.hasNextDouble() )
			d1 = sc1.nextDouble() ;
		else
			{ d1 = BAD_DATA_IN_FILE ; // -1 ; // error return -1 ;
			 System.out.println( "Incorrect (Not numeric) value in input file ( " + file1 +" ) : " + sc1.next() );
			}
		return d1 ;
		// int i1 ; 		i1 = Integer.parseInt(s1);
    }
 //----------------------------------------------------------------
 // number4  from file
    public int input_n4_file() 
    {
		Scanner sc1 = null;
		String file1 = FILE_NUMBER4_PATH ;
		try { 			
			sc1 = new Scanner(new File( file1 )); 			
			} 
		catch (FileNotFoundException e) 
			{
			//e.printStackTrace();
			System.out.printf("Error reading file " + file1 );
			System.out.printf(e.toString());
			}
			
		int  i1 ;
		// String s1 = sc1.next();
		// sc1.nextInt()
		if ( sc1.hasNextInt() )
			i1 = sc1.nextInt() ;
		else
			{ i1 = BAD_DATA_IN_FILE ;
			 System.out.println( "Incorrect (Not INTEGER) value in input file ( " + file1 +" ) : " + sc1.next() );
			}
		return i1 ;
    }
//----------------------------------------------------------------
//----------------------------------------------------------------
	// Radius from keyboard
    public double input_radius_keyboard() 
    {
    	
    	Scanner sc2 = new Scanner( System.in );
		System.out.println( "Input radius (numeric) : ");
		
		double  d1 ;
		 while (true)		//while ( sc2.hasNext() ) 
		{
		   if ( sc2.hasNextDouble() )
		   {
				d1 = sc2.nextDouble() ;
				break ;
		   }	
		   else 
			   System.out.println( "Not Numeric value; Re-enter ");
		   	   sc2 = new Scanner( System.in );
		}
		 // System.out.println( d1 );
    	    return d1 ;
    }
  //----------------------------------------------------------------
  // n4 from keyboard
    public int input_n4_keyboard() 
    {
    	
    	Scanner sc2 = new Scanner( System.in );
		System.out.println( "Input n4 (integer) : ");
		
		int  i1 ;
		 while (true)		
		{
		   if ( sc2.hasNextInt() )
		   {
				i1 = sc2.nextInt() ;
				break ;
		   }	
		   else 
			   System.out.println( "Not integer value; Re-enter ");
		   	   sc2 = new Scanner( System.in );
		}
    	    return i1 ;
    }
  //----------------------------------------------------------------
  //----------------------------------------------------------------
  //----------------------------------------------------------------
	// default 
    public double input_radius_default() 
    { 		return 10 ;     }
    
    public int input_n4_default() 
    { 		return 1234 ;     }
    
  //----------------------------------------------------------------
}
