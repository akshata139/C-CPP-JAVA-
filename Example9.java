import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

class Example9
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String filename;
        System.out.println("Enter file name : ");
        filename = sobj.nextLine();

        int iRet = 0,iCnt = 0;
        try
        {
            FileReader fileReader = new FileReader(filename);

            System.out.println("File open successfully!!");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((iRet = (bufferedReader.read()) )!= -1)
            {
                iCnt = iCnt + iRet;
            }
            System.out.println("Size of file is : "+ iCnt);
            bufferedReader.close();
        }

        catch(IOException ex)
        {
            System.out.println("Error : reading file name " + filename);
        }


    }
}