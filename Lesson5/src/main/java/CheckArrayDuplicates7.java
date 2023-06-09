import java.util.HashSet;

public class CheckArrayDuplicates7 {
    public static void main(String[] args) {
        int[] array = {10, 3, 46, 3, 2, 1, 2, 10};

        HashSet<Integer> uniqueElements = new HashSet<>();  //реализация интерфейса Set
        HashSet<Integer> duplicateElements = new HashSet<>();

        for (int num : array) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        if (duplicateElements.isEmpty()) {
            System.out.println("Массив не имеет повторяющихся элементов");
        } else {
            System.out.println("Массив имеет повторяющиеся элементы:");
            for (int num : duplicateElements) {
                System.out.print(num + " ");
            }
        }
    }
}





















