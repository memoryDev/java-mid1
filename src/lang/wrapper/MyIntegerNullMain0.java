package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(fintValue(intArr, -1));
        System.out.println(fintValue(intArr, 0));
        System.out.println(fintValue(intArr, 1));
        System.out.println(fintValue(intArr, 100));

    }

    private static int fintValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }

        return -1;
    }
}
