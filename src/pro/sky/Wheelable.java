package pro.sky;

public interface Wheelable {
    default void updateTyre() {
        System.out.println("Меняем покрышку ");
    }
}
