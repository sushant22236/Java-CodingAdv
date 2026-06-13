//Anonymus class

public class Demo4 {
    public static void main(String [] args){

        person p = new person(){
            @Override
            void introduce(){
                System.out.println("I am a student");
            }
        };

        p.introduce();

    }
}

class person{
    void introduce(){
        System.out.println("I am a person");
    }
}
