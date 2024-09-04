package lang.string.method;

public class StringUtilMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString);
        String numString2 = "" + num;
        System.out.println("빈문자열 + num: " + numString2);

        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
