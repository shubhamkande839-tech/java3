class student{
    String name;
    int marks;

    student() {
        name="om";
        marks=89;
    }

    student(String name) {
        this.name=name;
    }

    student(int marks ,String name) {
        this.name=name;
        this.marks=marks;
    }

    void display(){
        System.out.println("name is "+ name);
        System.out.println("marks are "+ marks);
    }

    
}

public class overloadedcons {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("om");
        student s3 = new student(44,"pawar");
        s1.display();
        s2.display();
        s3.display();
    } 
}
