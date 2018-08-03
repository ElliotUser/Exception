package exc03.exc03a;

public class MethNestTry {
    static void nesttry(int i){
        try {
            if (i==1)
                i = i/(i-i);

            if (i==2){
                int[] c = {1};
                c[42] = 9;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс за пределами массива: "+ e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 30/a;
            System.out.println("a = "+a);
            nesttry(a);
        }catch (ArithmeticException e){
            System.out.println("Деление на нуль: "+e);
        }
    }
}
