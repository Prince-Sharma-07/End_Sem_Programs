package End_sem_Programs;
class Student{
    int id;
    String name;
    int age;

    Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    Student(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void Display(){
        System.out.println(id + " " + name + " " + age);
    }
}
public class Const_Overload {
    public static void main(String[] args) {
        Student S1 = new Student(1 , "Prince");
        Student S2 = new Student(2 , "Vasvi" , 19);
        S1.Display();
        S2.Display();
    }
}
