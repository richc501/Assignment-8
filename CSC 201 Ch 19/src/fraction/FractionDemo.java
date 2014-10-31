package fraction;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class FractionDemo {
	public static void main(String[] args)
	{
		Fraction[] frac = new Fraction[3];
		for(int i=0;i<3;i++)
		{
			frac[i] = new Fraction((int)Math.random()*100+1,(int)Math.random()*100+1);
		}
		for(int j=0;j<3;j++)
		{
			try
			{
				FileOutputStream outFile = new FileOutputStream("SerialF.dat");
				ObjectOutputStream objOutput = new ObjectOutputStream(outFile);
				objOutput.writeObject(frac[j]);
				objOutput.close();
				outFile.close();
			} 
			catch (FileNotFoundException e)
			{
				System.out.println("File not found");
			} catch (IOException e) {
				System.out.println("IO Exception");
			} 
		}
	}
}