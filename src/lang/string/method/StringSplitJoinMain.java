package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String string : splitStr) {
            System.out.println("string = " + string);
        }

        String joinedStr = String.join("-", "Apple", "Banana", "Orange");
        System.out.println("joinedStr = " + joinedStr);

        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
