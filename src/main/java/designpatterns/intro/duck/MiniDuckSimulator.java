package designpatterns.intro.duck;

public class MiniDuckSimulator {
    static void main(String[] args) {
        Duck mallard  = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        Duck model = new ModelDuck();
        model.performFly();//from constructor
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // from setter
    }
}
