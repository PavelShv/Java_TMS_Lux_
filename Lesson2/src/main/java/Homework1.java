public class Homework1 {
    public static void main(String[] args) {
        printLiterals();
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
        char c = 'a';
        System.out.println(c);
        boolean bool = true;
        System.out.println(bool);
        String str = "Hello";
        System.out.println(str);
        char symbol = '\u03A9';
        System.out.println(symbol);
        int binary = 0b1010;
        System.out.println(binary);
        int octal = 012;
        System.out.println(octal);
        int decimal = 10;
        System.out.println(decimal);
        int hexadecimal = 0xA;
        System.out.println(hexadecimal);
        float floatLiteral = 3.14f;
        System.out.println(floatLiteral);
        double doubleLiteral = 2.71828;
        System.out.println(doubleLiteral);
    }

    public static int sum(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static double calculateHypotenuse(int a, int b) {
        return Math.hypot(a, b);
    }
}


