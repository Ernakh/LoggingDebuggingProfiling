package LoggingDebuggingProfiling;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log 
{
	public Logger logger;
	FileHandler fh;
	
	public Log(String arquivo) throws SecurityException, IOException
	{
		File f = new File(arquivo);
		
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		fh = new FileHandler(arquivo, true);
		
		logger = Logger.getLogger("teste");
		logger.addHandler(fh);;
		
		SimpleFormatter format = new SimpleFormatter();
		fh.setFormatter(format);
	}
}
