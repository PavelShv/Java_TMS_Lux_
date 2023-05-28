public class HomeWork {
    //    public static void main(String[] args) {
//        char ch = 'a';
//        char m = 12;//16 бит [0; 65536]
//       System.out.println((char) 0);
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        printEnglishLetters('A');
    public static void main(String[] args) {
        printEnglishLetters('A');
    }

    public static void printEnglishLetters(char startLetter) {
        for (char i = startLetter; i <= 'Z'; i++) {
            System.out.print(i + "\n");
        }
        System.out.println();
    }
}



