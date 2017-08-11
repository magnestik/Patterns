import methods.FlyNoWay;
import methods.Quack;

public class ModelDuck extends Duck{
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
