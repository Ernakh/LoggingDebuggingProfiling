package LoggingDebuggingProfiling;

import java.util.UUID;
import java.util.logging.Level;

public class MainClass {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//logging e debug
		System.out.println("teste");
		try 
		{
			Log meuLog = new Log("log.txt");
			
			meuLog.logger.setLevel(Level.WARNING);
			
			meuLog.logger.info("mensagem informativa");
			meuLog.logger.warning("mensagem de alerta/cuidado");
			meuLog.logger.severe("mensagem de alerta severo");
			
		} 
		catch (Exception e) 
		{
						
		}
		
		//profiling
		metodoRuim();
	}
	
	public static void metodoRuim() throws InterruptedException
	{
		String texto = "teste teste teste ";
		
		for (int i = 0; i < 15000; i++) 
		{
			texto += "texto " + i + " texto " + UUID.randomUUID().toString();
			Thread.sleep(1000);
		}
		
		System.out.println(texto);
	}
}
