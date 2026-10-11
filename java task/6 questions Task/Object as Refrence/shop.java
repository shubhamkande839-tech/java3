class shop{
    String component;
    int price;
}
public class fourth{
    public static void main(String[] args) {
        shop p1= new shop();
        p1.component="laptop";

        p1.price=50000;
        shop p2=p1;

        p2.price=45000;

        System.out.println(p1.price);
        System.out.println(p2.price);


    }
}
