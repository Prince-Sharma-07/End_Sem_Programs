package End_sem_Programs;
interface Printable{
    void print();

}
interface Showable{
    void print();
}

class Multiple_inheritance implements Printable,Showable {
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Multiple_inheritance obj = new Multiple_inheritance();
        obj.print();
    }
}
