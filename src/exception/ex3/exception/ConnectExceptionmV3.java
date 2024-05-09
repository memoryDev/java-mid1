package exception.ex3.exception;

public class ConnectExceptionmV3 extends NetworkClientExceptionV3{

    private final String address;

    public ConnectExceptionmV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
