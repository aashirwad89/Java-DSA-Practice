public class OOPs {

    public static void main(String[] args) {
        Pen p1 = new Pen(); //--> constructor

        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);


        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aashirwad";
        myAcc.setPass("1234");
        
    }

}




class BankAccount{
    public String username;
private String password;
public void setPass(String pwd){
password = pwd;
}

}

// Classes and Objects
public class Pen{
    // prop + function 
    String color;
    int tip;

    void setColor(String newCol){
        color = newCol;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


