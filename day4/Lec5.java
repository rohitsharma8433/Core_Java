/*Switch case */

import java.util.Scanner;

class Lec5 {
    public static void main(String[] args) {
        int a=10,b=20,ch;
        System.out.println("Enter user choice : ");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("Sum "+ (a+b));
            break;
            case 2:
            System.out.println("Sub "+ (a-b));
            break;
            case 3:
            System.out.println("Multi "+ (a*b));
            break;
            case 4:
            System.out.println("divi "+ (a/b));
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}
