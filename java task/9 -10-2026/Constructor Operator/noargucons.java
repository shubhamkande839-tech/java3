class student{
    String name;
    int marks;

    student() {
        name="om";
        marks=89;
    }

    void display(){
        System.out.println("name is "+ name);
        System.out.println("marks are "+ marks);
    }

    
}

public class noargucons {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    } 
}
