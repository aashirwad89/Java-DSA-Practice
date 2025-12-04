// class Student{
//     String name;
//     int marks;
// }

public class OPQue {
    public static void main(String[] args) {
//         Student s = new Student();
//    s.name = "Aman"
//;

Complex c = new Complex();
// c.num1 = 12;
// c.num2 = 24;
// System.out.println(c.num1 + c.num2);

Complex c = new Complex(4, 5);

// second question answer is B 
// third question answer is B
// fourth question answer is C
    }
}


class Complex {
    int real;
    int imaginary;
    public Complex(int r , int i){
        real = r;
        imaginary = i;
    }

    public static Complex add(Complex a , Complex b){
        return new Complex((a.real+b.real), (a.imaginary+b.imaginary))
    }
}
