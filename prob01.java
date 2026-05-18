import java.util.Scanner;
public class prob01{
    public static void main(String[] args){
        //shopping card program
        String item;
        double price;
        int quantity;
        char currency='$';
        double total;
        Scanner scanner=new Scanner(System.in);
        System.out.println("What item would you like to buy?:");
        item=scanner.nextLine();
        System.out.println("What is the price for each?:");
        price=scanner.nextDouble();
        System.out.println("How many would you like?");
        quantity=scanner.nextInt();
        total=price*quantity;
        System.out.println("Item:"+item);
        System.out.println("Price:"+currency+price);
        System.out.println("Quantity:"+quantity);
        System.out.println("TOTAL:"+total+currency);
        scanner.close();
    }
}
