import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to our calculater");
        System.out.println("Please enter your first number:");
        int firstNumber=input.nextInt();
        System.out.println("Please enter your second number:");
        int secondNumber=input.nextInt();
        int sum=firstNumber+secondNumber;
        System.out.println("Sum of your number is:"+sum);


    }
}
