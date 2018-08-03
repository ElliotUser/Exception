package exc01;

public class Excep2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("ЭТО НЕ БУДЕТ ВЫВЕДЕНО.");
        }catch (ArithmeticException ex){
            System.out.println("Деление на нуль.");

            System.out.println();
            System.out.println("Exception: " + ex +"\n");
        }
        System.out.println("После оператора catch");
    }
}
