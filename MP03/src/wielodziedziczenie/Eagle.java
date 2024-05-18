package wielodziedziczenie;

public class Eagle extends Animal  implements Flyable{
    private double flyingSpeed;
    @Override
    public void fly(){
        System.out.println("flying...");
    }
    @Override
    public double getFlyingSpeed(){
        return flyingSpeed;
    }
}
