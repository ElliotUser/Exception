package exc09;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 29, d = 0;
        int[] vals = {0,1,1,2,3,5};

        try {
            int result = a/d;

            vals[6] = 8;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение перехвачено: "+e);
        }
        System.out.println("После многократного перехвата.");
    }
}
