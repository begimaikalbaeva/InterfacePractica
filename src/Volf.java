public class Volf extends PredatorAbstract implements Huntable {
    @Override
    public void eat() {
        System.out.println("meat");

    }

    @Override
    public void hunt() {
        System.out.println("Wolves hunt rabbits");
    }
}
