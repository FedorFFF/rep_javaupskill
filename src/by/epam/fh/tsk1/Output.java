package by.epam.fh.tsk1;
import java.io.BufferedWriter;
// import java.io.File; import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Output {
	
	public static final int BAD_DATA_IN_FILE = -1;
	public  String file_out = "" ; 
	
	public static final String FILE_NUMBER4_PATH = "data/out_number4.txt" ; // "c://file.txt";
	public static final String FILE_RADIUS_PATH  = "data/out_radius.txt" ; 
//----------------------------------------------------------------
	// Radius to out file
  public void  output_radius_file( String file_out1 , double  radius , double area , double perimeter) 
  {
	  // c1.equals("-")  file_out.compare("" )
	  if ( file_out1 == null || file_out1.equals("")  ) this.file_out = FILE_RADIUS_PATH ;
	  		else  this.file_out =  file_out1  ;
		  
	  Date d1 = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
	  
	  String[] arr = new String[4]  ; //  {"Ankit","Bohra","Xyz"};
	  arr[0] = sdf.format(d1) ;
	  arr[1] = System.getenv("USERNAME") ;
	  
	  arr[2] = "Circle radius: " + radius+ "\nArea: " + area + "\nPerimeter: " + perimeter ;
	  arr[3] = "System.currentTimeMillis: " + Long.toString(System.currentTimeMillis()) ;	  // Integer.toString(number1);
	  // arr[3] =java.lang.ArrayIndexOutOfBoundsException:
			  
	  this.output_arr_file(file_out1, arr);
  }
//----------------------------------------------------------------
// n4 to out file
// У int нет нулл - у Integer есть - можно взять 0 - сумма цифр по идее не может быть разве что 0 - т.е лучше взять -1
public void  output_n4_file( String file_out1 , int n4 , int  mult1 , int sum1 ) 
{
	  if ( file_out1 == null || file_out1.equals("")  ) this.file_out = FILE_NUMBER4_PATH ;
	  		else  this.file_out =  file_out1  ;
		  
	  Date d1 = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	  System.out.println(sdf.format(d1));
	  
	  String[] arr = new String[3]  ; //  {"Ankit","Bohra","Xyz"};
	  arr[0] = sdf.format(d1) ;
	  arr[1] = "Число : " + n4 + "\nПроизведение цифр: " + mult1 ;
	  
	  if ( sum1 != -1) arr[2] = "Сумма цифр: " + sum1 ;
	  
	  this.output_arr_file(file_out1, arr);
	  
}

//----------------------------------------------------------------
// names = new String[] {"Ankit","Bohra","Xyz"};

public void  output_arr_file( String file_out1 , String arr[]  ) 
{
		  
	  Writer writer = null;
	  
	  try ( Writer writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( this.file_out  ), "utf-8"))) 
	  {
		
		for( int i = 0; i < arr.length; i++)
			{
				writer1.write( arr[i] + "\n");
			}
	  }
	  catch (IOException ex) 
	  	{
		  System.out.println( "Can't write to file : " + file_out1);  // report
		} 
	  finally 
	  	{
		  try {writer.close();} 
		  	catch (Exception ex) 
		  		{/*ignore*/}
		}
}

//----------------------------------------------------------------

}

