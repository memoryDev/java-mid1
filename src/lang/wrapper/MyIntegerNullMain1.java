package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInterger[] intArr = {new MyInterger(-1), new MyInterger(0), new MyInterger(1)};
        System.out.println(fintValue(intArr, -1));
        System.out.println(fintValue(intArr, 0));
        System.out.println(fintValue(intArr, 1));
        System.out.println(fintValue(intArr, 100));
    }

    private static MyInterger fintValue(MyInterger[] intArr, int target) {
        for (MyInterger myInterger : intArr) {
            if (myInterger.getValue() == target) {
                return myInterger;
            }
        }

        return null;
    }
}
