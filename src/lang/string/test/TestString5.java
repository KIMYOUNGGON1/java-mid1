package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int index = str.indexOf(ext);
        String fileNameString = str.substring(0, index);
        String extNameString = str.substring(index);

        System.out.println("fileNameString = " + fileNameString);
        System.out.println("extNameString = " + extNameString);
    }
}
