public class AmoebaMultiplication {
    public static void main(String[] args) {
        int amoebaCount = 1;
        for (int hours = 3; hours <= 24; hours += 3) {
            amoebaCount *= 2;
            System.out.println("Через " + hours + " часа(ов) количество амеб: " + amoebaCount);
        }
    }
}
