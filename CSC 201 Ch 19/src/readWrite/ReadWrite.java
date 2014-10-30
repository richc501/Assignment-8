package readWrite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadWrite {
	public static void main(String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		int studentID=0;
		double studentGPA=0;
		try {
			RandomAccessFile stu = new RandomAccessFile("Stu.dat","rw");
			//writing loop
			for(int i=0;i<5;i++)
			{
				studentID=10+i;
				studentGPA=Math.random()*6+1;
				System.out.println(studentID+": "+studentGPA);
				stu.writeInt(studentID);
				stu.writeDouble(studentGPA);
			}
			System.out.println("Enter your student ID:");
			int enteredStuID=keyboard.nextInt();
			int stuID=0;
			int index=0;
			//writing loop
			do
			{
				stu.seek(index);
				stuID = stu.readInt();
				index++;
			}while(stuID!=enteredStuID);
			System.out.println(stu.readDouble());
			stu.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} 
	}
}
