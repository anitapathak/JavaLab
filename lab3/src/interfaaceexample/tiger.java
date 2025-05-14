package interfaaceexample;

public class tiger implements animal {
    @Override
    public void eat(){
        System.out.println("I am a tiger. i am eating ");
    }
    @Override
    public void sleep(){
        System.out.println("I am a tiger i am sleeping");
    }
}
