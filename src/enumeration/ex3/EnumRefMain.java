package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("reg BASIC = " + refVal(Grade.BASIC));
        System.out.println("reg GOLD = " + refVal(Grade.GOLD));
        System.out.println("reg DIAMOND = " + refVal(Grade.DIAMOND));
    }

    private static String refVal(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
