    import java.util.*;
    import java.io.*;  
    class Example10
    {  
     public static void main(String args[])
     {
     	Scanner sobj = new Scanner(System.in);

     	String dirname;
     	System.out.println("Enter directory  : ");
     	dirname = sobj.nextLine();

      int iCnt = 0,iret = 0;

      try
        {
             File myobj = new File(dirname);

             String files[] = myobj.list();

             System.out.println("List of all files from the given directory are : ");

             for(int i = 0;i < files.length;i++)
             {
                iCnt = iCnt + files[i];

                System.out.println(files[i]  +"  ->  "+iCnt);
             }
        }
         catch(Exception e)
         {  
            System.out.println("Error : There is no such directory !");  
         }
     }  
    }  

    //symbolic link eka file madhe 2rya filecha path ekhadi file short cut mhanun tayar kartat ti fkt original filecha path store karte
    //device file hardware chi pretek file
    //regular file
    //directory file