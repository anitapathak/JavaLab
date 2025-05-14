package interfaaceexample;

public class dog implements animal {
    @Override
    public void eat(){
        System.out.println("I am a dog. i am eating ");
    }
    @Override
    public void sleep(){
        System.out.println("I am a dog i am sleeping");
    }
}
