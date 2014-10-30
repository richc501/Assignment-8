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
			System.out.println("Enter your student ID or -1 to quit:");
			int enteredStuID=keyboard.nextInt();
			int stuTempID=0; 
			double stuTempGPA=0;
			int index=0;
			//writing loop
			while(enteredStuID!=-1)
			{
				for(int i=0;i<5;i++)
				{
					stuTempID = stu.readInt();
					stuTempGPA = stu.readDouble();
					if(stuTempID==enteredStuID)
					{
						System.out.println(stuTempGPA);
						break;
					}
				}
				System.out.println("Enter your student ID or -1 to quit:");
				enteredStuID = keyboard.nextInt();
			}

			stu.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} 
	}
}
