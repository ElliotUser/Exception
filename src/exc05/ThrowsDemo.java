package exc05;

public class ThrowsDemo {
    static void throwsOne()throws IllegalAccessException{
        System.out.println("В теле метода throwsOne().");
        throw new IllegalAccessException("Демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwsOne();
        }catch (IllegalAccessException e){
            System.out.println("Перехват исключения: "+e);
        }
    }
}
