package by.epam.fh.tsk3;

import java.util.Random;

/* n четное  ??? - c нечетными тоже работает - не ясно зачем такое требование
сделать Квадратную матрицу 
 1 2 3 4 .. n
 n .. 1
 */
 
public class N_squareArray {
	  public static void main(String[] args) {
		     final int n_size = 100 ; 
		     int n1 = 3; // final 
		    Random rand = new Random();
		    System.out.println(rand);
		    
		    n1 = rand.nextInt(n_size) ;
		    System.out.println("Размерность : " + n1);
		    // int[] mas = new int[n]; 
		    int[][] m2 = new int[n1][n1];
		    
		    
		    int v1 ;
		    boolean even  ;
// --------------------------------------------------------------------- 		    
		    for (int i = 0; i < m2.length; i++) 
		    { 
		    	even = (i%2 == 0) ;  
		    	if ( even )  v1 =  1 ; 
		    		else v1 =  n1 ;
		    	
		    			
		      for (int j = 0; j < m2[i].length; j++) 
		      {	
		    	  m2[i][j] =  v1 ;
		    	  if ( even )  v1 ++ ; 
		    		else m2[i][j] =  v1 -- ;
		      } 
		    } 
// ----------------- Output		 
		    System.out.println("Квадратная матрица : " +  n1);
		    
		    for (int[] i : m2) { 
		      for (int j : i) { 
			  System.out.print(j + " "); 
		      } 
		      System.out.println(); 
		    } 
		  } 
}
