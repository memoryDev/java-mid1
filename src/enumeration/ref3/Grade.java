package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);

    private final int discouintPercent;

    Grade(int discouintPercent) {
        this.discouintPercent = discouintPercent;
    }

    public int getDiscouintPercent() {
        return discouintPercent;
    }

    public int discount(int price) {
        return price * getDiscouintPercent() / 100;
    }
}
