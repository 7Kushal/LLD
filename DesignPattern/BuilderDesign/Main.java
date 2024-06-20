package BuilderDesign;

public class Main {
    public static void main(String[] args) {
        phone p1 = new phone(new phoneBuilder().setRam(10).build());
        System.out.println(p1.toString());
        // System.out.println("afsdf");
    }
}
