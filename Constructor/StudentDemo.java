class StudentDemo{
    public static void main(String[] args){
     Student s1 = new Student();
     s1.id = 1;
     s1.name = "ram";
     Student s2 = new Student(5,"laxman");
     Student s3 = new Student();
     System.out.println("s1 details:"+ s1.id + ", "+s1.name);

    }
}

class Student{
    int id;
    String name;

    Student(){
        System.out.println("Default constructor");
    }

    Student(int id, String name){
    System.out.println("Parameterised Constructor");
    this.id = id;
    this.name =  name;
    
    }

}