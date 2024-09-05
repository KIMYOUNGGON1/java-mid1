package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".txt");

        String fileNameString = str.substring(0, index);
        String fileFormatString = str.substring(index);
        System.out.println("fileNameString = " + fileNameString);
        System.out.println("fileFormatString = " + fileFormatString);
    }
}
