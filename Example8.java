import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

class Example8
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String pathname,dirname;
        System.out.println("Enter the path where you want to create folder : ");
        pathname = sobj.nextLine();

        System.out.println("Enter the desired directory : ");
        dirname = sobj.nextLine();

        try
        {
            String path = pathname + dirname;

            File file = new File(path);

            if(file.mkdir())
            {
                System.out.println("Directory created susccessfully!!");
            }

        }

        catch(Exception ex)
        {
            System.out.println("Error : Failed to create directory!!");
        }


    }
}