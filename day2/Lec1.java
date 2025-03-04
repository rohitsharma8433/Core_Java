class Lec1{

    static int b=20;//Static vaiable 
    int c=30;//Instance VAriable 
        public static void main(String[] args) {
        int a=10; //thus is a Local variable 


        Lec1 ref=new Lec1();
        System.out.println(a);
        System.out.println(Lec1.b);
        System.out.println(ref.c);
        
    }
}