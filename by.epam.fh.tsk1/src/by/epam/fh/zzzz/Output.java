package by.epam.fh.zzzz;
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
	  System.out.println(sdf.format(d1));
	    
	  Writer writer = null;
	  try ( Writer writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( this.file_out  ), "utf-8"))) 
	  {
		  writer1.write(sdf.format(d1)  + "\n");
		  writer1.write("Circle radius: " + radius+ "\n Area: " + area + "\n Perimeter: " + perimeter + "\n");
		  // writer1.write( (System.getenv(FILE_RADIUS_PATH)) );
		  writer1.write( (System.getenv("USERNAME")) + "\n" );
		  // writer1.write( System.currentTimeMillis());
		  // writer1.write( (int) System.currentTimeMillis());
// System.out.println("Circle radius: " + radius1+ "\n Area: " + circle1.calc_area() + "\n Perimeter: " + circle1.calc_perimeter() + "\n");
		  	
	  }
	  catch (IOException ex) {
		  ;// report
		} 
	  finally 
	  	{
		  try {writer.close();} 
		  	catch (Exception ex) 
		  		{/*ignore*/}
		}
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
	    
	  Writer writer = null;
	  try ( Writer writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( this.file_out  ), "utf-8"))) 
	  {
		  writer1.write(sdf.format(d1)  + "\n");
		  writer1.write("Число : " + n4 + "\nПроизведение цифр: " + mult1 + "\n");
		  
		  if ( sum1 != -1) // null  
		  	writer1.write("\nСумма цифр: " + sum1 + "\n");
		  
	  }
	  catch (IOException ex) {
		  ;// report
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

