public class Bear extends PredatorAbstract implements Huntable{
    @Override
    public void eat() {
        System.out.println("honey and meat");
    }

    @Override
    public void hunt() {
        System.out.println("Bear hunt deer");
    }
}
