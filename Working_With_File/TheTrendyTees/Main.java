import java.lang.*;

public class Main
{
	public static void main(String [] args)
	{
		CreateFile cf = new CreateFile();
		cf.checkExistancy();
		cf.checkReadability();
		cf.checkWriteablity();
		cf.fileCreation();
		//cf.fileDeletion();
		cf.printAbsPath();
		cf.printFileSize();
		cf.listing();
		cf.directoryCreation();
		cf.fileCreationInDirectory();
		cf.fileCreationInDirectory2();
		
		
		
		WriteFile wf = new WriteFile();
		wf.Writting();
		
		ReadFile rf= new ReadFile();
		rf.reading();
	}
}