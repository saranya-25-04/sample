class Student{
    String name;
    int age;
    Student(){
        name="default";
        age=20;
    }
     Student(String n,int a){
        name=n;
        age=a;
        }
        public void display(){
       System.out.println("Name: "+name+" Age: "+age);
       }
}
public class obj1{
   public static void main(String[] args){
Student Student1=new Student("Test",20);
Student1.name="Test1";
Student1.age=20;
Student1.display();
}
}