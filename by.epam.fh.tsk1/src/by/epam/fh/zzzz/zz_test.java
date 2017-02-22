package by.epam.fh.zzzz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Класс Для тестов - Не испольузвется проекте 
*/

public class zz_test {
	public static final String FILE_NUMBER4_PATH = "data/src_n4_02.txt" ; // "data/src_number4.txt"
	
	
	public static void main(String[] args) {
			
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

	 System.out.println( sc1 );
	 
	 
	 // sc1.hasNext() false 
	 System.out.println( sc1.hasNext() );
	 
	 
	 
	 String s1 = sc1.next();
	 System.out.println( s1 );
	  

	int  i1 = 0 ;
	// String s1 = sc1.next();
	// sc1.nextInt()
/*	
	if ( sc1.hasNextInt() )
		i1 = sc1.nextInt() ;
	else
		{ 
		  i1 = -1 ;
		 // error return -1 ;
		 System.out.println( "Incorrect (Not INTEGER) value in input file ( " + file1 +" ) : " + sc1.next() );
		 
		}
*/	
	System.out.println( i1 );

}	
}
