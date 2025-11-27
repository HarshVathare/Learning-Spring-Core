package org.Ambiguity_problems;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/27/2025 12:55 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Addition : int , int ");
    }

    public Addition(double a, double b ){
        this.a=(int) a;
        this.b=(int) b;
        System.out.println("Addition : double , double ");
    }

    public void dosum(){
        System.out.println(" a is : "+this.a);
        System.out.println(" b is : "+this.b);
        System.out.println("Addition is : "+(this.a + this.b));
    }
}
