public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);


    }
}
class Person{
    String name;
    int age;
    Long mobno;
    Long panno;
    Long adhno;
    Person(String name, int age, Long mobno, Long panno, Long adhno) {
        this.name = name;
        this.age = age;
        this.mobno = mobno;
        this.panno = panno;
        this.adhno = adhno;
    }
    void display1(){
        System.out.print("Name is :" + name + "\n" + "Age is" + age + "\n" + "aadhar no is " + adhno + "\n" + "PAN number is :" + panno +"\n" +"mobile number is "+ mobno);
    }
}
class Bank extends Person{
    String bname;
    Long accno;
    String type;
    Bank( String name, int age, Long mobno, Long panno, Long adhno,String bname,Long accno,String type){
        super(name,age,mobno,panno,adhno);
        this.bname=bname;
        this.accno=accno;
        this.type=type;
    }
    void display2(){
        System.out.print("Bank name is " + bname + "\n" +"Account number is: "+ accno + "Type of account is :" + type);
    }
}
class Result extends Bank{
    Long balance;
    Long withdrawl;
    Long deposit;
    Result(String name, int age, Long mobno, Long panno, Long adhno,String bname,Long accno,String type,Long balance,Long withdrawl,Long deposit){
        super(name,age,mobno,panno,adhno,bname,accno,type);
        this.balance=balance;
        this.withdrawl=withdrawl;
        this.deposit=deposit;
    }
    void calculate(){
        System.out.println("Account balance is:" + balance+deposit);
        if (balance>=withdrawl){
            System.out.println("remaining amount is:" + (balance-withdrawl));
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}

class Pen {
    String colour;
    int Tip;
    String getColour(){
        return this.colour;
    }
    int getTip(){
        return this.Tip;
    }
    void setColour(String newcolour){
        this.colour = newcolour;
    }
    void setTip(int Tip){
        this.Tip = Tip;
    }
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called");
    }
}


