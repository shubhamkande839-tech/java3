class student{
    String name;
    int marks;

    student(int marks ,String name) {
        this.name=name;
        this.marks=marks;
    }

    void display(){
        System.out.println("name is "+ name);
        System.out.println("marks are "+ marks);
    }

    
}

public class parametercons {
    public static void main(String[] args) {
        student s1 = new student(50,"om");
        s1.display();
    } 
}
