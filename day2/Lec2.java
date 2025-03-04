
/* program for static have single copy and Local have multiple copy   */

class Lec2 {
    static int a=10;
    void fun(){
        int b=10;
        System.out.println(a+ " " + b );
        ++a; ++b;
    }
    public static void main(String[] args) {
        Lec2 r=new Lec2();
        r.fun();
        r.fun();
    } 
}

// Add two number program using two variable