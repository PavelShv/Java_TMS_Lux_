//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn

public class TypeConversionTable {
    public static void main(String[] args) {
        System.out.println("\t\t\tbyte\tshort\tchar\tint\t\tlong\tfloat\tdouble\tboolean");
        System.out.println("byte\t\tт\t\tня\t\tя\t\tя\t\tя\t\tя\t\tя\t\tx");
        System.out.println("short\t\tx\t\tт\t\tя\t\tя\t\tя\t\tя\t\tя\t\tx");
        System.out.println("char\t\tт\t\tт\t\tт\t\tя\t\tя\t\tя\t\tя\t\tx");
        System.out.println("int\t\t\tт\t\tт\t\tт\t\tт\t\tя\t\tя\t\tя\t\tx");
        System.out.println("long\t\tт\t\tт\t\tт\t\tт\t\tт\t\tя\t\tя\t\tx");
        System.out.println("float\t\tx\t\tx\t\tx\t\tx\t\tx\t\tт\t\tя\t\tx");
        System.out.println("double\t\tx\t\tx\t\tx\t\tx\t\tx\t\tx\t\tт\t\tx");
        System.out.println("boolean\t\tx\t\tx\t\tx\t\tx\t\tx\t\tx\t\tx\t\tт");
    }
}
