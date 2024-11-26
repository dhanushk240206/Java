p-01
class Main1{
    public static void main(String[] args){
        try{
            int c=5/0;
            System.out.println("rest of the code is try block");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException => "+ e.getMessage());
        }
    }
}



p-02
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        String filename = "test.txt";
        
        try {
            String fileContent = new CheckedExceptionDemo().readFile(filename);
            System.out.println(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("File: " + filename + " is missing, Please check file name");
        } catch (IOException e) {
            System.out.println("File is not having permission to read, please check the permission");
        }
    }

    public String readFile(String filename) throws FileNotFoundException, IOException {
        FileInputStream fin = null;
        StringBuilder sb = new StringBuilder();
        int i;

        try {
            fin = new FileInputStream(filename);
            while ((i = fin.read()) != -1) {
                sb.append((char) i);
            }

        } finally {
            if (fin != null) {
                fin.close();
            }
        }

        return sb.toString();
    }
}


p-03
import java.util.Scanner;
public class RunTimeExceptionDemo {
    public static void main(String[] args) {

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your age- Numeric value: "); 
        int age = inputDevice.nextInt();
        if (age>18){
    
        System.out.println("You are authorized to view the page");
        }else {
        System.out.println("You are not authorized to view page"); 
        }
    }
}


p-05
import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidUserInputExceptionDemo {

    public static void main(String[] JavaLatte) {
        System.out.println("Type an integer on the console");

        try {
            System.out.println("You typed: " + readFromConsole());
        } catch (InvalidUserInputException ex) {
            System.out.println("Exception is of type: " + ex);
            System.out.println("Original caught exception is of type: " + ex.getCause());
        }
    }

    public static int readFromConsole() {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        try {
            i = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Wrapping exception and throwing");
            throw new InvalidUserInputException("Invalid integer value entered", ex);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return i;
    }
}
class InvalidUserInputException extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public InvalidUserInputException() {
        super();
    }


    public InvalidUserInputException(String msg) {
        super(msg);
    }


    public InvalidUserInputException(Throwable throwable) {
        super(throwable);
    }


    public InvalidUserInputException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}


p-04
 import java.io.*;
 class GFG1{
     public static void main(String[] args) {
         int a=5;
        int b=0;
            try {
            
            System.out.println(a/b);
            }
            catch(ArithmeticException e) {
             e.printStackTrace();
            }
     }
 }
 import java.io.*;
 class GFG1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        
        try{
            System.out.println(a/b);
        }
       catch(ArithmeticException e) {
       System.out.println(e.toString());
        
        }    
        
    }
 }

import java.io.*;
class GFG1 {
    public static void main(String[] args) {
    int a=5;
    int b=0;
    try{
        System.out.println(a/b);
    }
    
    catch (ArithmeticException e) {
  
    System.out.println(e.getMessage());
    }
}
  }     
