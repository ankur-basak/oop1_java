import java.lang.*;
import java.io.*;

public class WriteFile
{
	public void Writting()
	{
		try
		{
			File f = new File("TheTrendyTees.txt");
			FileWriter fw = new FileWriter(f,false);
			fw.write("Welcome to the trendy tees.");
			fw.write("The biggest online shop at Bangladesh");
			fw.flush();
			fw.close();
			System.out.println("The biggest online shop at Bangladesh");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

