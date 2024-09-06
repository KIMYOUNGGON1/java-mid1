package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splits = fruits.split(",");

        for (String split : splits) {
            System.out.println("split = " + split);
        }

        String joinedString = String.join("->", splits);
        System.out.println("joinedString = " + joinedString);

    }
}
