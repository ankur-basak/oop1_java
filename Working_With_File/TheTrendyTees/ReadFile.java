import java.lang.*;
import java.io.*;

public class ReadFile
{
	public void reading()
	{
		try
		{
			File f =  new File ("TheTrendyTees.txt");
			FileReader fd = new FileReader(f);
			BufferedReader bfd = new BufferedReader(fd);
			String data = "", temp = "";
			
			while((temp=bfd.readLine())!=null)
			{
				data = data+"\n"+temp;
			}
			
			bfd.close();
			System.out.println(data);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}