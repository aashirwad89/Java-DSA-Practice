import java.sql.Struct;

public class OOPs {

    public static void main(String[] args) {
        // Pen p1 = new Pen(); //--> constructor

        // p1.setColor("blue");
        // System.out.println(p1.color);

        // p1.setTip(5);
        // System.out.println(p1.tip);


        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Aashirwad";
        // myAcc.setPass("1234");

        // Student s1 = new Student("Aashirwad");
        // System.out.println(s1.name);
        // Student s1 = new Student("54");
        // Student s2 = new Student(s1);




//         Fish shark = new Fish();
//         shark.eat(); 
//         Bird peacock = new Bird();
//     peacock.fly();
// Mammals dog = new Mammals();
// dog.walk();

// Horse H = new Horse();
// H.eat();
// H.walk();
// chicken C = new chicken();
// C.eat();
// C.walk();


// Queen q = new Queen();
// q.moves();

Student s1 = new Student();
s1.SchoolName = "Jai ho";
s1.name = "Jai ho ki maa";

Student s2 = new Student();
System.out.println(s2.SchoolName);
    }

}


// interface
// interface ChessPlayer{
//     void moves();
// }
// class Queen implements ChessPlayer{
//    public void moves(){
//         System.out.println("up , down , left , right , diagonal");
//     }
// }
// class Rook implements ChessPlayer{
//    public void moves(){
//         System.out.println("up , down , left , right");
//     }
// }
// class King implements ChessPlayer{
//    public void moves(){
//         System.out.println("up , down , left , right , diagonal by one step");
//     }
// }

// static keyword 
class Student {
    String name;
    int roll;


    static String SchoolName;

    void setName(String name){
     this.name = name;
    }

    String getName(){
        return this.name;
    }
}


// inheritance

// // --- Base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eat");
//     }
     
//     void breath(){
//         System.out.println("breath");
//     }
// }
// // --- Derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swim in water");
//     }
// }

// // hybrid inheritance 
// class Mammals extends Animal{
//     int walk;

//     void walk(){
//         System.out.println("walk");
//     }
// }
// class Bird extends Animal{
//     int fly;

//     void fly(){
//         System.out.println("fly");
//     }
// }

// // abstractions - data hiding + classes of abstract 
// abstract class Animal{
//     void eat(){
//         System.out.println("Abstact animal can eat also");
//     }

//     abstract void walk();
// }

// class Horse extends Animal{
//     void walk(){
//         System.out.println("walks on 4 leg");
//     }
// }

// class chicken extends Animal{
//     void walk(){
//         System.out.println("walk on 2 legs");
//     }
// }





// class Student{
//     String name;
//     int roll;
//     String password;

// Student(String name){
//     this.name = name;
// }
// Student (int roll){
//     this.roll = roll;
// }
// Student(String password){
//     this.password = password;
// }
// }




// class BankAccount{
//     public String username;
// private String password;
// public void setPass(String pwd){
// password = pwd;
// }

// }

// // Classes and Objects
// public class Pen{
//     // prop + function 
//     String color;
//     int tip;

//     void setColor(String newCol){
//         color = newCol;
//     }

//     void setTip(int newTip){
//         tip = newTip;
//     }
// }


