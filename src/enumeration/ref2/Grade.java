package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discouintPercent;

    Grade(int discouintPercent) {
        this.discouintPercent = discouintPercent;
    }

    public int getDiscouintPercent() {
        return discouintPercent;
    }
}
