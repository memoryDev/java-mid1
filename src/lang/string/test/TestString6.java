package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(key, i) >= 0) {
                i = str.indexOf(key, i);
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
