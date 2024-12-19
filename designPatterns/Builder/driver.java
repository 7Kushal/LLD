package Builder;

public class driver {
    public static void main(String[] args) {
        phone p1 = new phone(new phone.builder().setName("iphone").build());
        
    }
}
