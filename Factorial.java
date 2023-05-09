/*
 ============================================================================
 Name        : Factorial.java
 Author      : Roisin Mitchell
 Description : Method to calculate the factorial of a number (x)
 ============================================================================
 */
public class Factorial {
    public static void main(String[] args){
        int x = (int) (Math.random() * 10);
        Factorial myFact = new Factorial();
        int result = myFact.fact(x);
        System.out.println("The factorial of " + x + " is " + result);
    }
    public static int fact(int x) {
        if (x != 0) {
            return x * fact(x - 1);
        }
        return 1;
    }

}
