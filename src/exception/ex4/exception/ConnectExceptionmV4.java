package exception.ex4.exception;

public class ConnectExceptionmV4 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectExceptionmV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
