import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

class Example6
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String fname1,fname2;
        System.out.println("Enter first file name : ");
        fname1 = sobj.nextLine();

        System.out.println("Enter second file name : ");
        fname2 = sobj.nextLine();

        int iRet = 0;

        //declare and create input and output files
        File infile = new File(fname1);
        File outfile = new File(fname2);

        FileReader ins = null;  //creates file stream ins
        FileWriter outs = null; //creates file stream outs

        try
        {
            ins = new FileReader(fname1);
            outs = new FileWriter(fname2);

            //read and write till the end

            while((iRet = ins.read()) != -1)
            {
                outs.write(iRet);
            }

            System.out.println("File copyied Successfully!!");
        }

        catch(IOException ex)
        {
            System.out.println("Error cannot copy file");
        }


    }
}