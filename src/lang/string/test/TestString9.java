package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splits = email.split("@");
        String idPart = splits[0];
        String domainPart = splits[1];

        System.out.println("idPart = " + idPart);
        System.out.println("domainPart = " + domainPart);
    }
}
