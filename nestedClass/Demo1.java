
//Inner class
public class Demo1{
    public static void main(String[] args) {

        Outer outer = new Outer(); // creating object of outer class

        //Outer.inner inner = new Outer().new Inner(); // creating object of inner class

        Outer.Inner inner = outer.new Inner(); // creating object of inner class
        inner.fun();
        inner.display();
        System.out.println(inner.z);

        inner.show();
        
    }
}

class Outer{

    int x = 11;
    static int y = 10;
    class Inner{

        int x = 21;

        static void show(){
            System.out.println("hello from show");
        }
        static int z = 15; 
        void fun(){
            System.out.println("hello from fun");
            System.out.println(x); // inner class variable
            System.out.println(Outer.this.x); // outer class variable
        }
        void display(){
            System.out.println(x + " " + y); // inner class can access outer class variable directly
        }
    }
}
