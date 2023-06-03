public class TrianglePatterns {
    public static void main(String[] args) {
        drawTriangleA();
        drawTriangleB();
        drawTriangleC();
        drawTriangleD();
    }

    /**
     * Рисует треугольник A.
     */
    public static void drawTriangleA() {
        System.out.println("Треугольник A");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= 4; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Рисует треугольник B.
     */
    public static void drawTriangleB() {
        System.out.println("Треугольник B");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Рисует треугольник C.
     */
    public static void drawTriangleC() {
        System.out.println("Треугольник C");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= 4; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Рисует треугольник D.
     */
    public static void drawTriangleD() {
        System.out.println("Треугольник D");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
