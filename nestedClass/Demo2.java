public class Demo2 {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.fun();
    }
}

class Outer{
    void fun(){
        class Local{
            void sayHello(){
                System.out.println("Hello");
            }
        }
        Local local = new Local();
        local.sayHello();
    }
}
