class student{
    private String name;
    private  int marks;


void setname(String name){
    this.name=name;
}

void setmarks(int marks){
    this.marks=marks;
}

String getname(){
    return name;
}

int getmarks(){
    return marks;
}

}

public class one{
    public static void main(String[] args) {
        student s1= new student();
        s1.setname("omm");
        s1.setmarks(88);
        
        System.out.println("name: "+s1.getname());
        System.out.println("marks: "+s1.getmarks());
    
    }
}