class student{
    private String name;
    private  int marks;


void setname(String name){
    this.name=name;
}

void setmarks(int marks){
    if(marks>=0 && marks<=100){
        this.marks=marks;
    }
    else{
        
        
    }
    
}

String getname(){
    return name;
}

int getmarks(){
    return marks;
}

}

public class second{
    public static void main(String[] args) {
        student s1= new student();
        s1.setname("omm");
        s1.setmarks(1000);
        
        System.out.println("name: "+s1.getname());
        if(s1.getmarks()>=0 && s1.getmarks()<=100){
        System.out.println("marks: "+s1.getmarks());
        System.out.println("you enter invalid marks");
        }
        
    
    }
}
