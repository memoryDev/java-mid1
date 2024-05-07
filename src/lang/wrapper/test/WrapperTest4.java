package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);

        // Integer -> int (오토 언박싱)
        int intValue = integer1;

        // int -> Integer (오토 박싱)
        Integer integer2 = intValue;

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
