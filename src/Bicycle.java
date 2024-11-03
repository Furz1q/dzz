public class Bicycle extends WheeledTranstort{

    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у " + getModelName());
    }
}
