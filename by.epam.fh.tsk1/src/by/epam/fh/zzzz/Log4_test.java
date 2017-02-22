package by.epam.fh.zzzz;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

/*import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;*/

//ERROR StatusLogger No log4j2 configuration file found. Using default configuration: logging only errors to the console.

public class Log4_test {
	    static Logger log1 = LogManager.getLogger("Main");

	    public static void main(String[] args) 
	    {
	    	LoggerContext context1 = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
	    	
	        // log1.setLevel(Level.WARN);
	    	log1.log(Level.INFO, "1 argument" , "2 argument" , "3 argument");
	    	log1.log( Level.ALL, " All 1");
	    		    	
	    	log1.log( Level.INFO, context1.toString() ) ;
	    	//context1.
	    		    	
	    	log1.log( Level.INFO, log1.getClass().getName() ) ;
	    	log1.debug("** Debug 111");
	    	
	    	log1.log( Level.ALL, " All 1");
//	    	log1.log( Level.ALL, " All 2");
	    	
	    	log1.log(Level.WARN, " --- Warning ----------" , "ZZZ2" , "xxxxxxxxxxxxxxxxxxxxx****");
	        log1.log(Level.INFO, "1111");
	        log1.log(Level.INFO, "222222222");
	        log1.log(Level.INFO, "3333333333");
	        
	        log1.log( Level.ERROR, " Error");
	        
	        log1.log( Level.ALL, "====================" , "222===============" , "333===========***");
	    }
	}


