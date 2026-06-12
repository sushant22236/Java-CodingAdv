public class Demo {
    public static void main(String[] args){
        System.out.println(Outer.x);
        Outer.display();

        Outer outer = new Outer();

        System.out.println(outer.x);
        outer.run();

        //Inner class object
        Outer.Inner inner = new Outer.Inner();
        inner.fun();
        System.out.println(inner.x);
        inner.eat();
        System.out.println(Outer.Inner.y);
        inner.show();
        Outer.Inner.show();
    }
}

//static nested class

class Outer{

    //static method and variable calls by directly through call name because static method and variable are directly associated with class

    static int x = 10;
    static void display(){
        System.out.println("hello from display");
    }

    private static int c = 23; // static variable can be private also

    // non-static variable and method are not call directly through class because it is associated with object... so first need to create object of that class

    int y = 10;

    public void run(){
        System.out.println("running");
    }

    static class Inner{

        static int y = 15;
        static void show(){
            System.out.println("hello from show");
        }

        void fun(){
            System.out.println(c);
        }
        int x = 10;
        void eat(){
            System.out.println("eatingg");
        }
    }
}


class BankAccount{

    static class interestCalculator{
        double calculateInterestYearly(double principal, double rate){
            return principal * rate;
        }

        double calculateInterestMonthly(double principal, double rate){
            return principal * rate / 12;
        }


    }

    // public double computeInterest(double principle){
    //     return interestCalculator.calculateInterestYearly(principle, 0.05);
    // }



}


