import methods.FlyWithWings;
import methods.Quack;

public class MallardDuck extends Duck {
    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
