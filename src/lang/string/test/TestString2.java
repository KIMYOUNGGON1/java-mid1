package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;
        for (String string : arr) {
            System.out.println("string.length() = " + string.length());
            int length = string.length();
            result += length;
        }
        System.out.println("result = " + result);
    }
}
