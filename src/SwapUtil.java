public class SwapUtil {
    public static int getItself(int itself, int dummy) {
        return itself;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        /*
         * Swap with temporary variable
         */
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + ", " + b);

        /*
         * Swap without temporary variable
         * https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
         */

        // Method 1 (Using Arithmetic Operators)
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + ", " + b);


        // Method 2 (Using Bitwise XOR)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + ", " + b);


        /*
         * Swap In One Line using BitWise
         * https://www.geeksforgeeks.org/swap-two-variables-in-one-line-in-c-c-python-php-and-java/
         */
        a = a ^ b ^ (b = a);
        System.out.println(a + ", " + b);


        /*
         * https://stackoverflow.com/questions/3624525/how-to-write-a-basic-swap-function-in-java
         */
        a = getItself(b, b = a);
        System.out.println(a + ", " + b);
    }
}