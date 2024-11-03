public abstract class MotorTransport extends WheeledTranstort{

    public MotorTransport(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
