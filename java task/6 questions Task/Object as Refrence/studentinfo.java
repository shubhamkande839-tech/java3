class student{
    String name;
}
public class third{
    public static void main(String[] args) {
        student s1=new student();
        student s2=s1;
        s1.name="om";
        System.out.println("the name is :"+s1.name);
         System.out.println(s2.name);

    }
}