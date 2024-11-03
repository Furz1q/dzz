public class Truck extends MotorTransport{
    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkTrailer(){
        System.out.println("Проверяем прицеп у " + getModelName());
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
