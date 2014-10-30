package readMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadMe {
	public static void main(String[] args)
	{
		try
		{
			RandomAccessFile test = new RandomAccessFile(new File("pledge.txt"), "rw");
			test.seek(123);
			System.out.println(test.readLine());
			test.seek(135);
			System.out.println(test.readLine());
			test.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("IO Exception.");
		}
	}
}
