import java.util.Scanner;
public class code01 {
   public static void main(String[] args) {
    //calculate area of rectangukar
    double width;
    double height;
    double area;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter width value:");
    width=scanner.nextDouble();
    System.out.println("Enter height value:");
    height=scanner.nextDouble();
    area=width*height;
    System.out.println("The area is:"+area);
    scanner.close();
   }
}
