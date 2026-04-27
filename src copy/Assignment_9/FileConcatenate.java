package Assignment_9;
//Done //13-3-26
import java.io.*;
public class FileConcatenate 
{
  public static void main(String[] args) 
  {
      if (args.length < 2) 
          {
          System.out.println("please Enter file name for concatenation...." );
          return;
      }

      String outputFile = args[0];

      try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile)))
       {
          for (int i = 1; i < args.length; i++) 
              {
              String inputFile = args[i];//file1
              try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)))
               {
                  String line;
                  while ((line = reader.readLine()) != null) 
                      {
                      writer.write(line);
                      writer.newLine();
                  }
              }
               catch (IOException e) 
               {
                  System.out.println("Error reading file: " + inputFile);
              }
          }
          System.out.println("Files concatenated successfully into " + outputFile);
      } catch (IOException e) 
      {
          System.out.println("Error writing to output file: " + outputFile);
      }
  }
}
