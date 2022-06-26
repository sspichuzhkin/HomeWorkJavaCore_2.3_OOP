package pro.sky;

public class Truck extends WheelableTransport implements Service, Engineable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика ");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика ");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика ");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
