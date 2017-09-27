import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	protected int count = 0;//count used by insertion, merge, heap and quick
	

	public void FileWriter(String SortType, int FileNumber, int[] Array){
		
		String FullFileName = SortType + "Output" + FileNumber + ".txt";
		try{
			PrintWriter outputStream = new PrintWriter(FullFileName);//name of file

			outputStream.println("Count " + count);
			
			for(int i =0; i<Array.length; i++){
				outputStream.println(Array[i]);
			}
			System.out.println(FullFileName + " count: "+ count);
			
			count = 0;//reset the count
			outputStream.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public int[] FileReader(String FileName, int arraySize){//reads from the file
		
		int A[];
	
		Scanner x = null;
		A = new int[arraySize];
		
		try{x = new Scanner(new File(FileName));}
		catch(Exception e){System.out.println("file not found");}
		int i = 0;
		while(x.hasNext()){
			int a = x.nextInt();
			A[i] = a;//stores what was read from file into array
			i++;	
		}
		return A;	
	}
}
