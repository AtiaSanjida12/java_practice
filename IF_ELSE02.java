public class IF_ELSE02 {
    public static void main(String[] args){
        int age=70;
        if(age>100){
            System.out.println("You are very old");
        }
            else if(age>60){
                System.out.println("You are  old");
            }
            else if(age==18){
                System.out.println("You are teenager");
            }
            else if(age<18){
                System.out.println("You are a child");
            }
            else{
                System.out.println("out of range");
            }
        }
    }
