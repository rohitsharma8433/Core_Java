
/* Logical opretors  */

class Lec4 {
    public static void main(String[] args) {
        System.out.println("Logical And ");
        System.err.println(10>5 && 2>1); // true
        System.err.println(10>5 && 2<1);  //false
        System.err.println(10>5 && 2<1);  // false



        System.out.println("Logical OR ");
        System.err.println(10>5 || 2>1); // true
        System.err.println(10>5 || 2<1);  //true
        System.err.println(10<5 || 2<1);  // false

        System.err.println("-------Logical Not---- ");
        System.err.println(!(10>5));
    }
}
