import java.util.Scanner;

class Lec2 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       if(n>=0){
        System.out.println("Positive");
       }
       else{
        System.out.println("Negative");
       }
    }
}
