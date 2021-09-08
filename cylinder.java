import java.util.Scanner;
  import java.text.*;
  
  public class Main {
    public static void main (String[] args){
      final double PI = 3.14;
      double surfaceArea, volume, radious, height; 
      String name;

          Scanner reply1 = new Scanner(System.in);
          System.out.println("Enter your name here.");
          name = reply1.nextLine();
          System.out.println("name is" + " " + name + ".");
          System.out.println("Enter height of cylinder.");
          height = reply1.nextDouble();
          System.out.println("height is" + " " + height + ".");
          System.out.println("Enter radious of cylinder.");
          radious = reply1.nextDouble();
          System.out.println("radious is" + " " + radious + ".");
         

        volume = PI*(radious)*(radious)*height;
        surfaceArea = 2*PI*radious*(radious + height);
     
          DecimalFormat decFor = new DecimalFormat("0.00");
          System.out.println("The volume is" + " " + decFor.format(volume) );
          System.out.println("The surface area is" + " " + decFor.format(surfaceArea) );

          

        reply1.close();
    }
  }
