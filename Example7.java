import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

class Example7
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String fname;
        System.out.println("Enter file name : ");
        fname = sobj.nextLine();

        try
        {
           File file = new File(fname);

           if(file.isFile())
           {
            System.out.println("It is an regular file!");
           }
           else 
           {
            System.out.println("It is not an regular file!");
           }
        }
        catch(Exception ex)
        {
            System.out.println("Error occured");
        }


    }
}