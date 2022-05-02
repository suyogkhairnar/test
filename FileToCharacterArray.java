package IOExample2;
//wap to ask name of a file from user and store file data to character array

import java.util.Scanner;
import java.io.*;
public class FileToCharacterArray {

	public static void main(String[] args) {
   try
   {
   Scanner s= new Scanner(System.in);
   System.out.println(" enter file name ");  
   String fname =s.next();
   
   FileReader r= new FileReader(fname);
   
   File x= new File(fname);// File Class will has methods to see file properties
   
   int len=(int)  x.length(); //length method return long
   
   char c[]= new char[len];
   
   r.read(c);
   System.out.println(c);
   }catch(Exception f){}


	}

}
