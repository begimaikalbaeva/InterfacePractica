
public class Lion extends PredatorAbstract implements Huntable {
    @Override
    public void eat() {
        System.out.println("meet");
    }

    @Override
    public void hunt() {
        System.out.println("Liions hunt buffaloes");
    }
}
