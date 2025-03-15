import java.util.Scanner;

class Lec1 {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age : ");

        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18){
            System.out.println("You are Elegible");
        }

        System.out.println("Thankyou....!");
    }
    
}