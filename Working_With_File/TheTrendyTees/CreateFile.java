import java.lang.*;
import java.io.*;

public class CreateFile
{
	File f = new File ("TheTrendyTees.txt");
	File f2 = new File ("E:\\Ankur Docs\\aiubClass\\\\3rd semester\\Code\\\\Java1\\\\Working_with_File");
	File f3 = new File("E:\\Ankur Docs\\aiubClass\\3rd semester\\Code\\Java1\\Working_with_File\\TheTrendyPic");
	File f4 = new File("E:\\Ankur Docs\\aiubClass\\3rd semester\\Code\\Java1\\Working_with_File\\TheTrendyPic\\Business.txt");
	File f5 = new File("E:\\Ankur Docs\\aiubClass\\3rd semester\\Code\\Java1\\Working_with_File\\TheTrendyPic\\SellRecord.xls");
	
	public void checkExistancy()
	{
		if(f.exists())
		{
			System.out.println(f.getName()+" Exists");
		}
		else 
		{
			System.out.println(f.getName()+" Does not exists");
		}
	}
	
	public void checkReadability()
	{
		if(f.canRead())
		{
			System.out.println(f.getName()+ "is Readable");
		}
		else
		{
			System.out.println(f.getName()+ "is not Readable");
		}
	}
	
	public void checkWriteablity()
	{
		if(f.canWrite())
		{
			System.out.println(f.getName()+ "is Writeable");
		}
		else
		{
			System.out.println (f.getName()+ "is not Writeable");
		}
	}
	
	public void fileCreation()
	{
		try
		{
			if(f.createNewFile())
			{
				System.out.println(f.getName()+ "is Succesfully Created");
			}
			else
			{
				System.out.println(f.getName()+ "is not successfully Created");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	
	public void fileDeletion()
	{
		try
		{
			if(f.delete())
			{
				System.out.println(f.getName()+ "is deleted successfully");
			}
			else
			{
				System.out.println(f.getName()+ "is not deleted successfully");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void printAbsPath()
	{
		System.out.println(f.getAbsolutePath());
	}
	
	public void printFileSize()
	{
		System.out.println("Size: "+f.length());
	}
	
	public void listing()
	{
		String lt[] = f2.list();
		
		for(int i=0; i<lt.length;i++)
		{
			System.out.println(lt[i]);
		}
	}
	
	public void directoryCreation()
	{
		if(f3.mkdir())
		{
			System.out.println("Directory Succesfully Created");
		}
		else 
		{
			System.out.println("Directory is not succesfully created");
		}
	}
	
	public void fileCreationInDirectory()
	{
		try
		{
			if(f4.createNewFile())
			{
				System.out.println(f4.getName()+ "is Succesfully Created");
			}
			else
			{
				System.out.println(f4.getName()+ "is not successfully Created");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	
	public void fileCreationInDirectory2()
	{
		try
		{
			if(f5.createNewFile())
			{
				System.out.println(f5.getName()+ "is Succesfully Created");
			}
			else
			{
				System.out.println(f5.getName()+ "is not successfully Created");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	
}