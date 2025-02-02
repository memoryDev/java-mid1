package nested.inner.ex1;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void stat() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
