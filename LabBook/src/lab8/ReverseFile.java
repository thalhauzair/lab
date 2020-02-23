package lab8;
import java.io.*;
import java.util.Scanner;
public class ReverseFile {
	 public static void main(String[] args) throws IOException
     {
        try{
   
        	String source = "D:/Text/source.txt";
        	String target = "D:/Text/target2.txt";
       File sourceFile=new File(source);
       Scanner content=new Scanner(sourceFile);
        PrintWriter pwriter =new PrintWriter(target);

        while(content.hasNextLine())
        {
           String s=content.nextLine();
           StringBuffer buffer = new StringBuffer(s);
           pwriter.println(buffer.reverse());
        }
        content.close();    
        pwriter.close();
        System.out.println("File is copied successful!");
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }
     }
}
