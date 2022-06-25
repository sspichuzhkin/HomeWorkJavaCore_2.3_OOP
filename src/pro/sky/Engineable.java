package pro.sky;

public interface Engineable {
    default void checkEngine() {
        System.out.println("Проверяем двигатель ");
    }
}
